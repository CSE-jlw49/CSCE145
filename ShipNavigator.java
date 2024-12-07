// Jordan Walker
import java.util.Scanner;
public class ShipNavigator {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to Ship Navigator");
		
		String input = ""; // Creating a variable for line 80
		
		do { 
		
	    Ship s = new Ship();
	
		System.out.println("Enter the name of the ship:");
		
		String name = key.nextLine();
		
		s.setName(name);
		
		System.out.println("Enter the ship's launch date (mm/dd/yyyy):");
		
		String date = key.nextLine();
		
		s.setLaunchDate(date);
		
		System.out.println("Is it a cruise ship or cargo ship?");
		
		String ShipType = key.nextLine();
		
		if (ShipType.equalsIgnoreCase("Cruise Ship"))
		{
			CruiseShip cs = new CruiseShip();
			
			System.out.println("Enter the ship's passenger capacity:");
			
			int capacity = key.nextInt();
			key.nextLine();
			
			cs.setCapacity(capacity);
			
			System.out.println("How many crew members are on this ship?");
			
			int members = key.nextInt();
			key.nextLine();
			
			cs.setMembers(members);
			
			cs = new CruiseShip(name, date, capacity, members);
			
			System.out.println(cs.toString()); // Printing the values for the cruise ship
			
		}
		
		else 
		{
			CargoShip cs2 = new CargoShip();
			
			System.out.println("Enter the ship's tonnage (DWT):");
			
			int tonnage = key.nextInt();
			key.nextLine();
			
			cs2.setTonnage(tonnage);
			
			System.out.println("Enter the maximum speed of the ship (in mph):");
			
			double speed = key.nextDouble();
			key.nextLine();
			
			cs2.setSpeed(speed);
			
			cs2 = new CargoShip(name, date, tonnage, speed);
			
			System.out.println(cs2.toString()); // Printing the values for the cargo ship
					
		}
		
		System.out.println("Do you want to create another ship object? Enter yes or no:");
		
		input = key.nextLine();
		
		}while (input.equalsIgnoreCase("yes")); // Repeating the code if the user enters "yes"
		
				
		
		
		

	}

}
