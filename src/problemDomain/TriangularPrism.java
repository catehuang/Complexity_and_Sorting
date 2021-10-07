package problemDomain;
/**
* Class Description: This class represents a Triangular Prism and their
* associated attributes and methods
*/
public class TriangularPrism extends Prism 
{
	public TriangularPrism() 
	{
		super();
	}

	public TriangularPrism(double height, double side) 
	{
		super(height, side);
	}

	public double calcBaseArea() 
	{
		return getSide()  * getSide()  * Math.sqrt(3) / 4;
	}
	
	public double calcVolume() 
	{
		return (getSide()  * getSide()  * Math.sqrt(3) / 4) * getHeight();
	}
	
	@Override
	public String toString()
	{
		return String.format("%20s%10s%10.2f%10s%10.2f%10s%15.2f%15s%20.2f%3s", "TrianglarPrism", "[height=", getHeight(), ", side=", getSide(), ", calcBaseArea=", calcBaseArea(), ", calcVolume=", calcVolume(), "]");
	}
}
