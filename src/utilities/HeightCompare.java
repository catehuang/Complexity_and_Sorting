package utilities;

import java.util.Comparator;

import problemDomain.Shape;

public class HeightCompare implements Comparator <Shape> 
{
	/**
	 * @param s1 - shape object
	 * @param s2 - another shape object
	 * @return int to represent the result of height comparison: 1 for s1's area is greater than s2, -1 for s1's area is less than s2, 0 for two are equal.
	 */
	@Override
	public int compare(Shape s1, Shape s2)
	{
		return s1.compareTo(s2);
	}
}
