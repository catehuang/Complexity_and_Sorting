package problemDomain;

public class PentagonalPrism extends Prism
{
	
	public PentagonalPrism() 
	{
		super();
	}

	public PentagonalPrism(double height, double side) 
	{
		super(height, side);
	}

	public double calcBaseArea()
	{
		return 5 * getSide() * Math.tan(54) / 4;
	}
	
	public double calcVolume() 
	{
		return (5 * getSide() * Math.tan(54) / 4) * getHeight();
	}
	
	@Override
	public String toString() 
	{
		return String.format("%20s%10s%10.2f%10s%10.2f%10s%15.2f%15s%20.2f%3s", "PentagonalPrism", "[height=", getHeight(), ", side=", getSide(), ", calcBaseArea=", calcBaseArea(), ", calcVolume=", calcVolume(), "]");

	}
}
