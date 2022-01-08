package icici.loans.eduloans;

import icici.loans.carloans.A;// as A belongs to a different package we have to import

public class C extends A // is a relationship in inheritance
{
	
	public void m3 ()
	{
		System.out.println("I am m3 from C");
	}
	public static void main(String[] args)
	{
		C c = new C();//child class object can access parent class method and child class method
		c.m3();
		c.m1();
		
		A a = new A(); //parent class object can access only parent class method , this is called has a relationship
		a.m1();
	}

}
