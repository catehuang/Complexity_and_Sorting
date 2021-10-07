package utilities;

import java.util.Comparator;

import problemDomain.Shape;

public class HeightCompare implements Comparator <Shape> 
{
	@Override
	public int compare(Shape s1, Shape s2)
	{
		return s1.compareTo(s2);
	}
}
