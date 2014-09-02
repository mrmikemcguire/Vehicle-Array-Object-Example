
public class Vehicle
	{
	private String make;
	private String model;
	private String color;
	private double mpg;
	private double gasCapacity;
	
	public Vehicle(String ma, String mo, String c, double m, double g)
		{
		make = ma;
		model = mo;
		color = c;
		mpg = m;
		gasCapacity = g;
		}

	public String getMake()
		{
		return make;
		}

	public String getModel()
		{
		return model;
		}

	public String getColor()
		{
		return color;
		}

	public double getMpg()
		{
		return mpg;
		}

	public double getGasCapacity()
		{
		return gasCapacity;
		}
	
	public String toString()
		{
		return "Type of car:  " + color + " " + make + " " + model + "\nThe tank holds " + gasCapacity + " gallons and the car gets " + mpg + " miles per gallon.";
		}

	}
