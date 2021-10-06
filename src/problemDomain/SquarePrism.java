package problemDomain;

public class SquarePrism extends Prism
{
	public SquarePrism() 
	{
		super();
	}

	public SquarePrism(double height, double side) 
	{
		super(height, side);
	}

	public double calcBaseArea() 
	{
		return getSide() * getSide();
	}
	
	public double calcVolume() 
	{
		return getSide()  * getSide()  * getHeight();
	}
	
	@Override
	public String toString()
	{
		return String.format("%20s%10s%5.2s%10s%10.2f%10s%15.2f%15s%20.2f%3s", "SquarePrism", "[height=", getHeight(), ", side=", getSide(), ", calcBaseArea=", calcBaseArea(), ", calcVolume=", calcVolume(), "]");
	}
}
