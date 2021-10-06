package managers;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

import problemDomain.*;
import utilities.*;

public class SortManager 
{
	private String fileName;
	private Shape[] arr; 
	private long startTime;
	private long endTime;
	
	public SortManager(String fileName, String comparedBy, String sortedBy) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException 
	{
		Comparator comp;
		this.fileName = fileName;
		if (comparedBy.equals("V")) {
			comp = new VolumeCompare();
		} 
		else if (comparedBy.equals("A"))
		{
			comp = new BaseAreaCompare();
		} 
		else // (comparedBy == "H")
		{
			comp = new HeightCompare();
		}

		loadData();
		
		switch (sortedBy)
		{
			case "I":
				startTime = System.currentTimeMillis();
				SortingAlgorithms.insertionSort(arr, comp);
				endTime = System.currentTimeMillis();
				break;
			case "S":
				startTime = System.currentTimeMillis();
				SortingAlgorithms.selectionSort(arr, comp);
				endTime = System.currentTimeMillis();
				break;
			case "M":
				startTime = System.currentTimeMillis();
				SortingAlgorithms.mergeSort(arr, comp);
				endTime = System.currentTimeMillis();
				break;
			case "Q":
				startTime = System.currentTimeMillis();
				SortingAlgorithms.quickSort(arr, comp);
				endTime = System.currentTimeMillis();
				break;
			case "B":
				startTime = System.currentTimeMillis();
				SortingAlgorithms.bubbleSort(arr, comp);
				endTime = System.currentTimeMillis();
				break;
			case "Z":
				startTime = System.currentTimeMillis();
				SortingAlgorithms.radixSort(arr, comp);
				endTime = System.currentTimeMillis();
				break;
			default:
				System.out.println("Error. Cannot find the method to sort!");
				System.exit(1);
		}
		System.out.println("Done!");
		printArray();
		System.out.println();
		System.out.println("Excution Time: " + (endTime - startTime) + " ms");
	}

	private void printArray() {
		for(int i = 0; i < arr.length; i++)
		{
			
			if (i % 1000 == 1)
			{
				System.out.printf("%8d%3s", i, "th:");
				System.out.println(arr[i]);
			}
			
			
			/*
			System.out.printf("%8d%3s", i, "th:");
			System.out.println(arr[i]);
			*/
		}
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
}
