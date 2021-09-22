package managers;

import java.io.*;
import java.util.*;

import problemdomain.*;

public class SortManager 
{

	private String fileName;
	private String comparedBy;
	private String sortedBy;
	private String[][] arr;
	
	public SortManager(String fileName, String comparedBy, String sortedBy) throws FileNotFoundException 
	{
		this.fileName = fileName;
		this.comparedBy = comparedBy;
		this.sortedBy = sortedBy;
		
		loadData();
		compareByHeight();
		
		// Unit tests
		//generateEveryShape();
	}

	private void loadData() throws FileNotFoundException
	{
		Scanner in = new Scanner(new File(fileName));

		int totalShapes = in.nextInt();
		arr = new String[totalShapes][3];

		for (int i = 0; i < totalShapes; i++) 
		{
			arr[i][0] = in.next();
			arr[i][1] = in.next();
			arr[i][2] = in.next();
		}
	}
	
	private void compareByHeight() 
	{
		Arrays.sort(arr, Comparator.comparingDouble(o -> Double.parseDouble(o[1])));
		
		for (int i = 0; i < 100; i++) 
		{ 
			System.out.printf("%15s %10s %10s\n", arr[i][0], arr[i][1], arr[i][2]); 
		}
	}
	
	private void generateEveryShape()
	{
		Cone cone = new Cone(1, 1);
		Cylinder cylinder = new Cylinder(22, 22);
		Pyramid pyramid = new Pyramid(10, 10);
		OctangonalPrism octangonalp = new OctangonalPrism(5, 5);
		PentagonalPrism pentagonalp = new PentagonalPrism(20, 20);
		SquarePrism suqarep = new SquarePrism(10.1, 10.1);
		TrianglarPrism trianglarp = new TrianglarPrism(15, 15);

		ArrayList<Shape> shape_list = new ArrayList<Shape>();

		shape_list.add(cone);
		shape_list.add(cylinder);
		shape_list.add(pyramid);
		shape_list.add(octangonalp);
		shape_list.add(pentagonalp);
		shape_list.add(suqarep);
		shape_list.add(trianglarp);

		for(Shape item:shape_list)
		{
			System.out.println(item);
		}
	}
}
