package icici.loans.carloans;

public class SecondClass 
{
	int a = 10, b = 200, result;
	public void m1()
	{
		result = a+b;
		System.out.println("The result is:" + result);
		
	}
	public static void main(String[] args)
	{
				System.out.println("Hello Java");
				SecondClass sc1=new SecondClass();
				// Class object is needed to declare in main method to access the class data and methods
				sc1.m1(); // sc1 is the class reference variable
				
				SecondClass sc2=new SecondClass();
				sc2.m1();
			//We can create n no of objects for a class	
				
	}
}
