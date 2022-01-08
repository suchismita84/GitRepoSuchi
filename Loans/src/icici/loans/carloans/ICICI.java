package icici.loans.carloans;

public class ICICI implements Rbi // ICICI is class name and Rbi is interface
{
//here we are defining the child class to call inside main method
	public static void main(String[] args) 
	{
		ICICI i=new ICICI();
		i.deposit();
		i.withdrawal();
	}
    public void withdrawal() 
    {
    	System.out.println("Withdraw money");
    }
    public void deposit() 
    {
    	System.out.println("Deposit money");
    }
}
