package icici.loans.eduloans;

import icici.loans.carloans.A;
import icici.loans.carloans.B;

public class D extends B // IS A relationship
{

	public void m3()
	{
		System.out.println("I am m3 from D");
	}
	public static void main(String[] args)
	{
		D d = new D();
		d.m3();
		System.out.println(d.hashCode());//hashcode is property of Object Class
		d.m1();
		d.m2();//Multi level inheritance (accessing properties of class B and class A)
		
		B b=new B();
		b.m1();
		b.m2(); //accessing B class and A class properties  with b class object
	
	    A a = new A();
	    a.m1(); //accessing A class properties with a class object
	}
	

}
