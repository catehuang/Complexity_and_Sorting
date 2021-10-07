package utilities;

import java.util.Comparator;

import problemDomain.Shape;

public class BaseAreaCompare implements Comparator <Shape> 
{	
	/**
	 * @param s1 - shape object
	 * @param s2 - another shape object
	 * @return int to represent the result of area comparison
	 */
	@Override
	public int compare(Shape s1, Shape s2) 
	{
		if (s1.calcBaseArea() > s2.calcBaseArea())
		{
			return 1;
		} 
		else if (s1.calcBaseArea() < s2.calcBaseArea())
		{
			return -1;
		} 
		else
		{
			return 0;
		}
	}
}
