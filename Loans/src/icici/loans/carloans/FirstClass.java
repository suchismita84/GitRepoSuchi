package icici.loans.carloans;

public class FirstClass 
{
  int a = 10 , b = 20, result ;//Data properties
     public void add() // Behaviour
     {
    	 result=a+b;
    	 System.out.println("The result is " + result);
    	 System.out.println("Hello");
     }
	public static void main(String[] args)
	{
				FirstClass obj=new FirstClass();//class object
				obj.add();//using class object we call the methods of the class
	}

}
//Data properties and behaviours will be defined as per client requirement.