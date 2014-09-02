
public class VehicleRunner
	{

	public static void main(String[] args)
		{
		AutoInventory ai = new AutoInventory();
		
		ai.addVehicle(new Vehicle("Honda", "Civic", "Blue", 40.3, 10.0));
		ai.addVehicle(new Vehicle("Suburu", "Outback", "Red", 21.4, 12.9));
		ai.addVehicle(new Vehicle("Ford", "Fiesta", "Yellow", 33.7, 11.5));
		ai.addVehicle(new Vehicle("Mazda", "CX-9", "White", 19.4, 18.7));
		ai.addVehicle(new Vehicle("Chevrolet", "Camaro", "Red", 12.3, 16.2));

		System.out.println(ai.toString());
		
		//Count the number of red cars
		
		int numberOfRedCars = 0;
		
		for (int i = 0; i < AutoInventory.inventory.size(); i++)
			{
			if (AutoInventory.inventory.get(i).getColor().equals("Red"))
				{
				numberOfRedCars++;
				}
			}
			System.out.println("The number of red cars is " + numberOfRedCars);
			System.out.println();
		
		//Calculate the average gas mileage
		
		double cumulativeMPG = 0.0;
		double averageMPG = 0.0;
		
		for (int i = 0; i < AutoInventory.inventory.size(); i++)
			{
			cumulativeMPG = cumulativeMPG + AutoInventory.inventory.get(i).getMpg();
			averageMPG = cumulativeMPG / AutoInventory.inventory.size();
			}
		System.out.println("The average mpg of the cars on the lot is " + averageMPG + " miles per gallon.");
		System.out.println();
			
		//Print out the range of each vehicle
		for (int i = 0; i < AutoInventory.inventory.size(); i++)
			{
			System.out.println("The " + AutoInventory.inventory.get(i).getColor() + " " +
					AutoInventory.inventory.get(i).getMake() + " " +
					AutoInventory.inventory.get(i).getModel() + " can drive " +
					AutoInventory.inventory.get(i).getGasCapacity() * AutoInventory.inventory.get(i).getMpg() +
					" miles on a single tank of gas.");
			}

		}

	}
