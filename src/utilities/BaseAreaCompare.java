package utilities;

import java.util.Comparator;

import problemDomain.Shape;

public class BaseAreaCompare implements Comparator <Shape> 
{
	@Override
	public int compare(Shape o1, Shape o2) {
		if (o1.calcBaseArea() > o2.calcBaseArea())
		{
			return 1;
		} 
		else if (o1.calcBaseArea() < o2.calcBaseArea())
		{
			return -1;
		} 
		else
		{
			return 0;
		}
	}
}
