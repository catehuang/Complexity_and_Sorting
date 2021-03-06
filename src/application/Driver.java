package application;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import managers.SortManager;

public class Driver {
				
		/**
		 * Take users command line and start sorting using the selected sorting method and source file 
		 * provide notification when command line input is invalid
		 * @param args users' command line input
		 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {

		String fileName = "res/";
		String comparedBy = "";
		String sortedBy = "";
		
		/**
		 * Check parameters are valid for all flags
		 * -F must be followed by a file name
		 * -T must be followed by one of the characters(v, h, or a)
		 * -S must be followed by one of the characters(b, s, i, m, q, or z)
		 */
		for (int i = 0; i < args.length; i++) 
		{
			if(args[i].length() > 2) 
			{
				if (args[i].toUpperCase().startsWith("-F"))
				{
					fileName += args[i].toUpperCase().split("-F")[1];
				} 
				else if (args[i].toUpperCase().startsWith("-T")) 
				{
					comparedBy = args[i].toUpperCase().split("-T")[1];
				}
				else if (args[i].toUpperCase().startsWith("-S"))
				{
					sortedBy = args[i].toUpperCase().split("-S")[1];
				} 
			}
		}
		
		File f = new File(fileName);
		
		if (! f.exists())
		{
			System.out.println("File not found.");
		}
		else if (!comparedBy.matches("(V|H|A)")) 
		{
			System.out.println("Invalid parameter: " +  comparedBy + ". -T must be followed by one of the characters(v, h, or a)");
		} 
		else if (!sortedBy.matches("(B|S|I|M|Q|Z)")) 
		{
			System.out.println("Invalid parameter: " +  sortedBy + ". -S must be followed by one of the characters(b, s, i, m, q, or z)");
		} 
		else
		{
			System.out.println("Starting sort...");
			new SortManager(fileName, comparedBy, sortedBy);
		}
	}
}
