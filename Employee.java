class Address
{
   int houseno;
   String city;
   int pin;
   public Address(int houseno, String city, int pin)
   {
      this.houseno=houseno;
      this.city=city;
      this.pin=pin;	  
   }
}


class Employee
{
	String name;
	int id;
	Address address;
	Employee(String name, int id , Address a)
	{
		this.id=id;
		this.name=name;
        address=a;	
		display();
	}
	void display()
	{
		System.out.println("id  = "+ id);
		System.out.println("name  = "+ name);
		System.out.println("houseno  = "+ address.houseno);
		System.out.println("city  = "+ address.city);
		System.out.println("pin  = "+ address.pin);
		
		
	}
	
	public static void main(String args[])
	{
		Address a=new Address(12,"Gaya",5);
		
		Employee e=new Employee("manoj",3,a);
		
	
	}
}