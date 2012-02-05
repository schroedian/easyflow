/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow;

import java.io.File;

public class Util {

	public static String joinPath(String pathElement1, String pathElement2) {
		File file1 = new File(pathElement1);
	    File file2 = new File(file1, pathElement2);
	    return file2.getPath();
	}

} // Util
