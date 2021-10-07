package problemDomain;
/**
* Class Description: This class represents a Shape and their
* associated attributes and methods
*/
public abstract class Shape implements Comparable <Shape>
{
	private double height;

	public Shape() 
	{
		super();
	}

	public Shape(double height) 
	{
		super();
		this.height = height;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}
	
	@Override
	public int compareTo(Shape s) 
	{

		if (this.height > s.getHeight()) 
		{
			return 1;
		} 
		else if (this.height < s.getHeight()) 
		{
			return -1;
		} 
		else 
		{
			return 0;
		}
	}

	public abstract double calcBaseArea();
	public abstract double calcVolume(); 
}
