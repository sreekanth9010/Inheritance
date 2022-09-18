package inheritance;

class X
{
	public X()
	{
		super();
		System.out.println("In X constructor");
	}
	
	public X(int i)
	{
		super();
		System.out.println("In X constructor INT");
	}
	
}
class Y extends X
{
	public Y()
	{
		super();
		System.out.println("In Y constructor");
	}
	
	public Y(int i)
	{
		super();
		System.out.println("In Y constructor INT");
	}
	
}



public class ConstructorInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();//in X constructor 
		Y y = new Y(7);//in X constructor In Y constructor Int
		
		
		

	}

}
