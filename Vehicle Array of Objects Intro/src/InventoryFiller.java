
public class InventoryFiller
	{
	public static void fillInventory()
		{
		AutoInventory ai = new AutoInventory();
		
		ai.addVehicle(new Vehicle("Honda", "Civic", "Blue", 40.3, 10.0));
		ai.addVehicle(new Vehicle("Suburu", "Outback", "Red", 21.4, 12.9));
		ai.addVehicle(new Vehicle("Ford", "Fiesta", "Yellow", 33.7, 11.5));
		ai.addVehicle(new Vehicle("Mazda", "CX-9", "White", 19.4, 18.7));
		ai.addVehicle(new Vehicle("Chevrolet", "Camaro", "Red", 12.3, 16.2));

		System.out.println(ai.toString());
		}
	}
