import java.util.ArrayList;

public class AutoInventory
	{
	static ArrayList <Vehicle> inventory = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle)
		{
		inventory.add(vehicle);
		}
	
	public String toString()
		{
		String autoInventory = "\tAuto Inventory\n\n";
		for (Vehicle v : inventory)
			{
			autoInventory = autoInventory + v.toString() + "\n\n";
			}
		return autoInventory;
		}
	}
