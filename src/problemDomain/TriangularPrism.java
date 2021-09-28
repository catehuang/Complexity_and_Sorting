package problemDomain;

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
		return "TrianglarPrism [height=" + getHeight() + ", side=" + getSide() + 
				", calcBaseArea=" + String.format("%.2f", calcBaseArea()) + 
				", calcVolume=" + String.format("%.2f", calcVolume()) + "]";
	}
}
