package problemDomain;

public class Cylinder extends Shape 
{
	private double radius;
	
	public Cylinder() 
	{
		super();
	}

	public Cylinder(double height, double radius) 
	{
		super(height);
		this.radius = radius;
	}
	
	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	public double calcBaseArea() 
	{
		return Math.PI * radius * radius;
	}
	
	public double calcVolume() 
	{
		return Math.PI * radius * radius * getHeight();
	}
	
	@Override
	public String toString() 
	{
		return String.format("%20s%10s%5.2s%10s%10.2f%10s%15.2f%15s%20.2f%3s", "Cylinder", "[height=", getHeight(), ", radius=", getRadius(), ", calcBaseArea=", calcBaseArea(), ", calcVolume=", calcVolume(), "]");

	}
	
}
