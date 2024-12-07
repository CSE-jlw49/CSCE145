// Jordan Walker
public class CruiseShip extends Ship {
	
	private int capacity;
	private int members;
	
	public CruiseShip()
	{
		this.capacity = 0;
		this.members = 0;
	}
	
	public CruiseShip(String xName, String xLaunchDate, int xCapacity, int xMembers)
	{
		super(xName, xLaunchDate);
		this.setCapacity(xCapacity);
		this.setMembers(xMembers);
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public int getMembers()
	{
		return this.members;
	}
	
	public void setCapacity(int xCapacity)
	{
		if (xCapacity > 0)
		{
			this.capacity = xCapacity;
		}
		
		else
		{
			System.out.println("Invalid value for capacity.");
		}
	}
	
	public void setMembers(int xMembers)
	{
		if (xMembers > 0)
		{
			this.members = xMembers;
		}
		
		else
		{
			System.out.println("Invalid value for crew members.");
		}
	}
	
	public String toString()
	{
		return super.toString() +
		 "\nCapacity: "+this.capacity+"\nCrew Members: "+this.members;
		
		
	}

	

}
