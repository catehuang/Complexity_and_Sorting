package utilities;

import java.util.Comparator;

import problemDomain.Shape;

public class BaseAreaCompare implements Comparator <Shape> 
{	
	/**
	 * @param s1 - shape object
	 * @param s2 - another shape object
	 * @return int to represent the result of area comparison: 1 for s1's area is greater than s2, -1 for s1's area is less than s2, 0 for two are equal.
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
