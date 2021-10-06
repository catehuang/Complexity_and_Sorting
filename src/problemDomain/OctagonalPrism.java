package problemDomain;

public class OctagonalPrism extends Prism 
{
	public OctagonalPrism() 
	{
		super();
	}
	
	public OctagonalPrism(double height, double side) 
	{
		super(height, side);
	}

	public double calcBaseArea() 
	{
		return 2 * (1 + Math.sqrt(2)) * getSide() * getSide();
	}
	
	public double calcVolume()
	{
		return (2 * (1 + Math.sqrt(2)) * getSide() * getSide()) * getHeight();
	}
	
	@Override
	public String toString()
	{
		return String.format("%20s%10s%10.2f%10s%10.2f%10s%15.2f%15s%20.2f%3s", "OctangonalPrism", "[height=", getHeight(), ", side=", getSide(), ", calcBaseArea=", calcBaseArea(), ", calcVolume=", calcVolume(), "]");
	}
}
