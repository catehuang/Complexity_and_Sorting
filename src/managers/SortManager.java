package managers;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

import problemDomain.*;
import utilities.*;

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
		Comparator comp;
		
		if (comparedBy == "V") {
			comp = new VolumeCompare();
		} 
		else if (comparedBy == "A")
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
				System.out.println("Insertation sort by " + comparedBy);
				SortingAlgorithms.insertionSort(arr, comp);
				break;
			case "S":
				System.out.println("Selection sort by " + comparedBy);
				SortingAlgorithms.selectionSort(arr, comp);
				break;
			case "M":
				System.out.println("Merge sort by " + comparedBy);
				SortingAlgorithms.mergeSort(arr, comp);
				break;
			case "Q":
				System.out.println("Quick sort by " + comparedBy);
				SortingAlgorithms.quickSort(arr, comp);
				break;
			case "B":
				System.out.println("Bubble sort by " + comparedBy);
				SortingAlgorithms.bubbleSort(arr, comp);
				break;
			case "Z":
				System.out.println("Secret sort by " + comparedBy);
				SortingAlgorithms.secretSort(arr, comp);
				break;
			default:
				System.out.println("Error. Cannot find the sorting: " + comparedBy);
				System.exit(1);
		}
		printArray();
	}

	private void printArray() {
		for(int i = 0; i < arr.length - 1; i++)
		{
			System.out.println(arr[i]);
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
