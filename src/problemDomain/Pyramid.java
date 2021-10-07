package problemDomain;
/**
* Class Description: This class represents a Pyramid and their
* associated attributes and methods
*/
public class Pyramid extends Shape
{
	private double side;
	
	public Pyramid() 
	{
		super();
	}
	
	public Pyramid(double height, double side)
	{
		super(height);
		this.side = side;
	}

	public double getSide()
	{
		return side;
	}

	public void setSide(double side)
	{
		this.side = side;
	}

	public double calcBaseArea()
	{
		return side * side;
	}

	public double calcVolume() 
	{
		return (1.0/3) * side * side * getHeight();
	}
	
	@Override
	public String toString() 
	{
		return String.format("%20s%10s%10.2f%10s%10.2f%10s%15.2f%15s%20.2f%3s", "Pyramid", "[height=", getHeight(), ", side=", getSide(), ", calcBaseArea=", calcBaseArea(), ", calcVolume=", calcVolume(), "]");
	}
}
