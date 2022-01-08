package icici.loans.carloans;

public interface Rbi
{  
   // Behaviours and properties
	int x = 100;
	public void withdrawal(); // Abstract methods don't have a body
    public void deposit();
 
   public static void main(String[] args) 
{
	Rbi r; // interface reference is created
	r=new ICICI(); //calling the ChildClass name here using interface reference
	r.deposit();
	r.withdrawal();
}
}
//we can't create an object for interface in main method, we have to create a childclass for this interface
// using the child class object we can call the functions of interface in main method