package inheritance;
class A
{
	  int i=7;
	A()
	{
		System.out.println("A parameterless constructor");
	}
	A(int i)
	{
		this.i=i;
		System.out.println("A parameter constructor");
	}
	
	public void show()
	{
		System.out.println("in A show method");
	}
}
class B extends A
{
	int i=9;
	B()
	{
		System.out.println("B parameterless constructor");
//		print();
	}
	B(int i)
	{
		this.i=i;
		System.out.println("B parameter constructor");
		
	}
	public void print()
	{
		int i=5;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		super.show();
	}
}
public class TestsValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A b = new B();
//b.print();
((B)(b)).print();
	}

}
