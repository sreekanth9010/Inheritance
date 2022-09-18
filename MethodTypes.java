package inheritance;


class Parent
{
	public int height;
	public String skinColour;
	public String eyeColour;
	public String nose;
	
	
	public Parent()
	{
		System.out.println("in parameterless constructor of parent");
	}
	public Parent(int height, String skinColour, String eyeColour, String nose) {
		super();
		
		this.height = height;
		this.skinColour = skinColour;
		this.eyeColour = eyeColour;
		this.nose = nose;
		System.out.println("in parameterized constructor of parent");
	}
	
	public void doJob()
	{
		System.out.println("Parent does a job");
	}
	
	public void display()
	{
		System.out.println(height);
		System.out.println(skinColour);
		System.out.println(eyeColour);
		System.out.println(nose);
	}
	
}

class Child extends Parent
{
	
	public Child()
	{
		System.out.println("in parameterless constructor of child");
	}
	public void swim()
	{
		System.out.println("child can swim");
	}
	
	
	public void display()
	{
		System.out.println("in child class display");
	}
	public void smoke()
	{
		System.out.println("child is a chain smoker");
	}
}



public class MethodTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent(167,"brown","black","short");
		Child c = new Child();
		Parent cp =new Child();
		p.doJob();
		p.display();
		c.doJob();
		c.display();
		c.smoke();
		c.swim();
		cp.doJob();
		cp.display();
		

	}

}
