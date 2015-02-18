/*******************************************************************************
 * Copyright (c) 2015, 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.tooling.data;

import java.nio.file.Path;
import java.text.MessageFormat;

import melnorme.utilbox.misc.Location;

public abstract class ValidationMessages {

	public static String Path_Error_EmptyPath = 
			"No path specified.";
	
	private static String Path_Error_InvalidPath = 
			"Invalid path `{0}`.";
	public static String Path_InvalidPath(String path) {
		return MessageFormat.format(Path_Error_InvalidPath, path);
	}
	
	private static String Location_Error_NotAbsolute = 
			"Specified path `{0}` is not an absolute path.";
	public static String Location_NotAbsolute(Path path) {
		return MessageFormat.format(Location_Error_NotAbsolute, path);
	}
	
	private static String Location_Error_DoesntExist = 
			"Specified path `{0}` does not exist.";
	public static String Location_DoesntExist(Location location) {
		return MessageFormat.format(Location_Error_DoesntExist, location);
	}
	
	private static String Location_Error_NotAFile = 
			"Specified path `{0}` is not a file.";
	public static String Location_NotAFile(Location location) {
		return MessageFormat.format(Location_Error_NotAFile, location);
	}
	
	private static String Location_Error_NotADirectory = 
			"Specified path `{0}` is not a directory.";
	public static String Location_NotADirectory(Location location) {
		return MessageFormat.format(Location_Error_NotADirectory, location);
	}
	
}