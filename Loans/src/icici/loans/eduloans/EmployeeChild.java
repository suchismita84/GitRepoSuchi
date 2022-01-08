package icici.loans.eduloans;

public class EmployeeChild extends Employee
{
    String city;//we can initialize this variable through constructors
    
	public EmployeeChild(String city) // it calls the parent class default constructors
	{
		super(100,"Advik",12.34f);//we gave highest no of parameter 
		this.city = city;
		System.out.println(this.city);
	}

	public void m5()
	{
		this.city = city;  //current class and super class instance variables	
	}
	
	public static void main(String[] args)
	{
		EmployeeChild ec= new EmployeeChild("Pune");
	}

}
