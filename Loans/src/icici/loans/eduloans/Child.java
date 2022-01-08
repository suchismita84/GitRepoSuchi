package icici.loans.eduloans;


class Parent 
{
	public void workhard()
	{
		System.out.println("Parent : Wakeup early, Go to college");
	}
	public void care()
	{
		System.out.println("Parent: Take care of yourself");
	}
}

public class Child extends Parent
{
	public void workhard()
	{
		System.out.println("child :Wakeup anytime, don't study");
	}
	public void love()
	{
		System.out.println("Child : I am in love");
	}
	
	public static void main(String[] args)
	{

		Child obj = new Child();
		obj.care();
		obj.workhard();
        obj.love();
	}

}
