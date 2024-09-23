package lab13.assignment_13_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * //PSEUDO-CODE 
 * boolean searchForFile(Object file, Object startDir) {
 *     Object[] fileSystemObjects = startDir.getContents(); 
 *     for (Object o: fileSystemObjects) {
 *         //base case 
 *         if (isFile(o) && isSameFile(o,f)) {
 *             return true; 
 *         }
 * 
 *         if (isDirectory(o)) {
 *             searchForFile(file, o);
 *         } 
 *     } //file not found in startDir
 *     return false; 
 * }
 */
public class FileSearch {
	static boolean found = false;
	// Store the text that is found in the
	// file that is found in this String variable
	static String discoveredText = "This is the file you are seeking!";

	public static boolean searchForFile(String filename, String startDir) {
		File fileObject = new File(startDir);
		
		if (!fileObject.exists()) {
			return false;
		}
		
		if (!fileObject.isDirectory()) {
			if (filename.compareTo(fileObject.getName()) == 0) {
				System.out.println(fileObject.getAbsolutePath());
				return true;
			}
			else {
				return false;
			}
		}
		
		boolean found = false;
		String[] names = fileObject.list();
		for (String name: names) {
			File fObj = new File(startDir + File.separator + name);
			if (fObj.exists()) {
				if (fObj.isFile()) {
					if (name.equals(filename)) {
						System.out.println(fileObject.getAbsolutePath());
						found = true;
					}
				}
				else {
					if (searchForFile(filename, startDir + File.separator + name) == true) {
						found = true;
					}
				}
			}
		}
		
		return found;
	}

}
