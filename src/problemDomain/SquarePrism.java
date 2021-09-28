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
		return "SquarePrism [height=" + getHeight() + ", side=" + getSide() + 
				", calcBaseArea=" + String.format("%.2f", calcBaseArea()) + 
				", calcVolume=" + String.format("%.2f", calcVolume()) + "]";
	}
}
