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
package org.globus.ftp;

/**
   Represents FTP stream mode restart marker, as defined in RFC 959.
   Not used.
 */
public class StreamModeRestartMarker 
    implements Marker, RestartData {

    protected long offset;
    
    public StreamModeRestartMarker(long offset) {
	this.offset = offset;
    }
    
    public String toFtpCmdArgument() {
	return String.valueOf(offset);
    }
}
