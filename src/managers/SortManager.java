package managers;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import problemDomain.*;

public class SortManager 
{

	private String fileName;
	private String comparedBy;
	private String sortedBy;
	private Shape[] arr; 
	
	public SortManager(String fileName, String comparedBy, String sortedBy) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException 
	{
		this.fileName = fileName;
		this.comparedBy = comparedBy;
		this.sortedBy = sortedBy;
		
		loadData();
		//compareByHeight();
		
	}

	private void loadData() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		// when we know the type of input is and we can use scanner
		Scanner in = new Scanner(new File(fileName));
		
		// special value at the beginning of the data file 
		int numberOfShapes = Integer.parseInt(in.next());
		arr = new Shape[numberOfShapes];
		
		for (int i = 0; i < numberOfShapes; i++)
		{
			String className = "problemDomain." + in.next();
			Class cls = Class.forName(className);
			Class paramtype[] = new Class[2];
			paramtype[0] = Double.TYPE;
			paramtype[1] = Double.TYPE;
			
			Object argList[] = new Object[2];
			argList[0] = Double.parseDouble(in.next());
			argList[1] = Double.parseDouble(in.next());
			
			Constructor cst = cls.getConstructor(paramtype);
			Shape obj = (Shape) cst.newInstance(argList);
			arr[i] = obj;
			
			// System.out.println(arr[i]);
		}

		in.close();
		
	}
	
	private void compareByHeight() 
	{
		/*
		Arrays.sort(arr, Comparator.comparingDouble(o -> Double.parseDouble(o[1])));
		
		for (int i = 0; i < 100; i++) 
		{ 
			System.out.printf("%15s %10s %10s\n", arr[i][0], arr[i][1], arr[i][2]); 
		}
		*/
	}
}
