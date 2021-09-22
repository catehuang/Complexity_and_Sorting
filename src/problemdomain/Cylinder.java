package problemdomain;

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
		return "Cylinder [height=" + getHeight() + ", radius=" + getRadius() + 
				", calcBaseArea=" + String.format("%.2f", calcBaseArea()) + 
				", calcVolume=" + String.format("%.2f", calcVolume()) + "]";
	}
	
}
