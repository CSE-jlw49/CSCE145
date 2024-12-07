// Jordan Walker
public class CargoShip extends Ship{

	private int tonnage;
	private double speed;
	
	public CargoShip()
	{
		this.tonnage = 0;
		this.speed = 0;
	}
	
	public CargoShip(String xName, String xLaunchDate, int xTonnage, double xSpeed)
	{
		super(xName, xLaunchDate);
		this.setTonnage(xTonnage);
		this.setSpeed(xSpeed);
	}
	
	public int getTonnage()
	{
		return this.tonnage;
	}
	
	public double getSpeed()
	{
		return this.speed;
	}
	
	public void setTonnage(int xTonnage)
	{
		if (xTonnage > 0)
		{
			this.tonnage = xTonnage;
		}
		
		else
		{
			System.out.println("Invalid value for tonnage.");
		}
	}
	
	public void setSpeed(double xSpeed)
	{
		if (xSpeed > 0)
		{
			this.speed = xSpeed;
		}
		else
		{
			System.out.println("Invalid value for speed.");
		}
	}
		
		public String toString()
		{
			return super.toString() +
			 "\nTonnage: "+this.tonnage+"\nSpeed: "+this.speed;
		
		
	}
}
