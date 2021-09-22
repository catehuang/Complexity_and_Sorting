package problemdomain;

public class OctangonalPrism extends Prism 
{
	public OctangonalPrism() 
	{
		super();
	}
	
	public OctangonalPrism(double height, double side) 
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
		return "OctangonalPrism [height=" + getHeight() + ", side=" + getSide() + 
				", calcBaseArea=" + String.format("%.2f", calcBaseArea()) + 
				", calcVolume=" + String.format("%.2f", calcVolume()) + "]";
	}
}
