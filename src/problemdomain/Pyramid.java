package problemdomain;

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
		return "Pyramid [height=" + getHeight() + ", side=" + getSide() + 
				", calcBaseArea=" + String.format("%.2f", calcBaseArea()) + 
				", calcVolume=" + String.format("%.2f", calcVolume()) + "]";
	}
}
