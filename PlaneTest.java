package inheritance;

class Plane
{
	int age;
	private int cost;
	
	public void fly()
	{
		cost=10;
		System.out.println("plane is flying");
	}
	public void takeOff()
	{
		System.out.println("plane is taking off ..!");
	}
}
class CargoPlane extends Plane
{
	//Overridden method from parent
	public void fly()
	{
		System.out.println("overridden method of cargo palne flies");
	}
	
	//this is specialized method to child and done with method overloading
	public  void fly(int i)
	{
		System.out.println("new method of cargo palne flies");
	}
	public void carryGoods()
	{
		System.out.println("cargo palne carry goods..!");
	}
}
class PassengerPlane extends Plane
{
	public  void fly()
	{
		System.out.println("overridden method of passenger palne flies");
	}
	public void carryPassengers()
	{
		System.out.println("passenger palne carry goods..!");
	}
}

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p = new Plane();
		p.fly();
		p.takeOff();
		
		CargoPlane c = new CargoPlane();
		c.fly();
		c.fly(0);
		c.takeOff();
		c.carryGoods();
		
		
		
		Plane cp = new CargoPlane();//can't call specialized methods with parent reference 
		cp.fly();					//we can overload a inherited method and it is treated as specialized methods of child 
		cp.takeOff();
		cp.fly();
		Plane pp = new PassengerPlane();//this is known as Up-casting through this we can achieve polymorphism
		pp.fly();
		pp.takeOff();

	}

}
