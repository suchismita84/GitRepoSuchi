package icici.loans.carloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args)
	{
		ChildClass obj=new ChildClass();
		obj.m1(); // method from Abstract class
		obj.m2(); //defined and called this m2 method here in child class
	}

	public void m2() //defined the m2 method from abstract class
	{
		System.out.println("I am m2 from childclass");
	}
	
}
