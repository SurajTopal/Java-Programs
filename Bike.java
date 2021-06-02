class Vehicle
{
	void run()
	{
		System.out.println("vehicle is working..");
	}
}

class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Bike is working..");
	}
	public static void main(String args[])
	{
		Bike obj=new Bike();
		obj.run();
		
	}
}
