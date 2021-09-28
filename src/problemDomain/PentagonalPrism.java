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
		return "PentagonalPrism [height=" + getHeight() + ", side=" + getSide() + 
				", calcBaseArea=" + String.format("%.2f", calcBaseArea()) + 
				", calcVolume=" + String.format("%.2f", calcVolume()) + "]";
	}
}
