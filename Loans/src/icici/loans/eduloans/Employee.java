package icici.loans.eduloans;

public class Employee 
{
	
	int eno;
	String ename;
	float sal;
	public Employee()
	{
		System.out.println("I am default constructor");
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	public Employee(int eno) 
	{
		this();//calling default constructor
		//super(); //its implicit in all constructors either visible or invisible, always in 1st line
		this.eno =eno;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	public Employee(int eno, String ename)
	{
		this(eno);
		this.eno=eno; //this refers to current class instance variable
		this.ename=ename;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}

	
	public Employee(int eno, String ename, float sal) 
	{
		//super();
		this(eno,ename);
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}

	public static void main(String[] args) 
	{
	   /*Employee e1 = new Employee();
	   System.out.println(e1.eno);
	   System.out.println(e1.ename);
	   System.out.println(e1.sal);	   	   
	   
	   Employee e2 = new Employee(1744,"Suchi");
	   System.out.println(e2.eno);
	   System.out.println(e2.ename);
	   System.out.println(e2.sal);
	   
	   Employee e3 = new Employee(1745);
	   System.out.println(e3.eno);
	   System.out.println(e3.ename);
	   System.out.println(e3.sal);*/
	   
	   Employee e4 = new Employee(1746,"Sid",14000.32f);
	   /*System.out.println(e4.eno);
	   System.out.println(e4.ename);
	   System.out.println(e4.sal);*/
	}

}
