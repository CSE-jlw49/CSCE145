// Jordan Walker
public class Ship {
	
	private String name;
	private String launchDate;
	
	public Ship()
	{
		this.name = "unknown";
		this.launchDate = "01/01/1990";		
	}
	
	public Ship(String xName, String xLaunchDate)
	{
		this.setName(xName);
		this.setLaunchDate(xLaunchDate);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getLaunchDate()
	{
		return this.launchDate;
	}
	
	public void setName(String xName)
	{
		this.name = xName;
	}

	public void setLaunchDate(String xLaunchDate)
	{
		String[] datePart = xLaunchDate.split("/"); // Splitting the month, day, and year
		
		int year = Integer.parseInt(datePart[2]); // Creating a variable for the year entered by the user
		
		if (year >= 1990 && year <= 2019) 
		{
		this.launchDate = xLaunchDate;
		}
		
		else if (year < 1990)
		{
			System.out.println("Launch date prior to 1990. Resetting "+this.name+"'s launch date to the \ndefault 01/01/1990");
		}
		
		else
		{
			System.out.println("Launch date after 2019. Resetting "+this.name+"'s launch date to the \ndefault 01/01/1990");
		}
	}
	
	public String toString()
	{
		return "Name: "+this.name;
	}
}
