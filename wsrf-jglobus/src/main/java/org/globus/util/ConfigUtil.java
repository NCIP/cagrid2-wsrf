/*
 * Portions of this file Copyright 1999-2005 University of Chicago
 * Portions of this file Copyright 1999-2005 The University of Southern California.
 *
 * This file or a portion of this file is licensed under the
 * terms of the Globus Toolkit Public License, found at
 * http://www.globus.org/toolkit/download/license.html.
 * If you redistribute this file, with or without
 * modifications, you must include this notice in the file.
 */
package org.globus.util;

import java.io.File;
import java.io.IOException;

public class ConfigUtil {

    public static final int UNDEFINED_OS = -1;
    public static final int WINDOWS_OS   = 0;
    public static final int UNIX_OS      = 1;
    public static final int MAC_OS       = 2;
    public static final int OTHER_OS     = 3;
  
    private static int osType = UNDEFINED_OS;

    private static final String PROXY_NAME = "x509up_u";

    public static String globus_dir = null;

    private static String UID = null;
    
    static {
        UID = System.getProperty("user.name");
    }
    
    static {
        globus_dir = System.getProperty("user.home") + 
            File.separator + 
            ".globus" +
            File.separator;
    }
    
    /** Returns default PKCS11 library name */
    public static String discoverPKCS11LibName() {
        return "dspkcs"; // use the ibutton library as the default for now
    }
    
    /** Returns default location of user cert file */
    public static String discoverUserCertLocation() {
        String location = null;
        location = globus_dir + "usercert.pem";
        return location;
    }
    
    /** Returns default location of user key file */
    public static String discoverUserKeyLocation() {
        String location = null;
        location = globus_dir + "userkey.pem";
        return location;
    }
    
    /**
     * Tries to discover user proxy location.
     * If a UID system property is set, and running on a Unix machine it
     * returns /tmp/x509up_u${UID}. If any other machine then Unix, it returns
     * ${tempdir}/x509up_u${UID}, where tempdir is a platform-specific
     * temporary directory as indicated by the java.io.tmpdir system property.
     * If a UID system property is not set, the username will be used instead
     * of the UID. That is, it returns ${tempdir}/x509up_u_${username}
     */
    public static String discoverProxyLocation() {
        String dir = null;

        if (getOS() == UNIX_OS) {
            dir = "/tmp/";
        } else {
            String tmpDir = System.getProperty("java.io.tmpdir");
            dir = (tmpDir == null) ? globus_dir : tmpDir;
        }
        
        return getLocation(dir, PROXY_NAME + "_" + UID);
    }

    private static String getLocation(String dir, String file) {
        File f = new File(dir, file);
        return f.getAbsolutePath();
    }
    
    /**
     * Returns the user id. The user id is obtained by executing 'id -u'
     * external program. 
     * <B>No it isn't, that's stupid.  Returns the value of System.getProperty("user.name");</B>
     * <BR><BR><B>Note: </B><I>
     * Under some circumstances, this function executes an external program; 
     * thus, its behavior is influenced by environment variables such as the
     * caller's PATH and the environment variables that control dynamic 
     * loading.  Care should be used if calling this function from a program 
     * that will be run as a Unix setuid program, or in any other manner in
     * which the owner of the Unix process does not completely control its
     * runtime environment. 
     * </I>
     *
     * @throws IOException if unable to determine the user id.
     * @return the user id
     */
    public static String getUID() throws IOException {
        return UID;
    } 

    /**
     * Discovers location of CA certificates directory.
     * First the ${user.home}/.globus/certificates directory is checked.
     * If the directory does not exist, and on a Unix machine, the
     * /etc/grid-security/certificates directory is checked next.
     * If that directory does not exist and GLOBUS_LOCATION 
     * system property is set then the ${GLOBUS_LOCATION}/share/certificates
     * directory is checked. Otherwise, null is returned. 
     * This indicates that the certificates directory could
     * not be found.
     */
    public static String discoverCertDirLocation() {
        String location = null;
    
        location = getDir(globus_dir + "certificates");
        if (location != null) return location;
        
        if (getOS() == UNIX_OS) {
            location = getDir( "/etc/grid-security/certificates");
            if (location != null) return location;
        }

        String suffix = File.separator + "share" + File.separator + 
            "certificates";
            
        location = getDir(System.getProperty("GLOBUS_LOCATION") +
                          suffix);
        if (location != null) return location;
        
        return null;
    }

  
    public static int getOS() {
        if (osType != UNDEFINED_OS) {
            return osType;
        }

        String osname = System.getProperty("os.name");
        if (osname != null) {
            osname = osname.toLowerCase();
            if (osname.indexOf("windows") != -1) {
                osType = WINDOWS_OS;
            } else if ( (osname.indexOf("solaris") != -1) ||
                        (osname.indexOf("sunos") != -1) ||
                        (osname.indexOf("linux") != -1) ||
                        (osname.indexOf("aix") != -1) ||
                        (osname.indexOf("hp-ux") != -1) ||
                        (osname.indexOf("compaq's digital unix") != -1) ||
                        (osname.indexOf("osf1") != -1) ||
                        (osname.indexOf("mac os x") != -1) ||
                        (osname.indexOf("netbsd") != -1) ||
                        (osname.indexOf("irix") != -1) ) {
                osType = UNIX_OS;
            } else if (osname.indexOf("mac") != -1) {
                osType = MAC_OS;
            } else {
                osType = OTHER_OS;
            }
        } else {
            osType = OTHER_OS;
        }
    
        return osType;
    }

    private static String getDir(String directory) {
        if (directory == null) return null;
        File f = new File(directory);
        if (f.isDirectory() && f.canRead()) {
            return f.getAbsolutePath();
        } else {
            return null;
        }
    }
    
}
