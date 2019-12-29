class Office
{
	void Work()
	{
	System.out.println("Working....");
	}
}
class Manager extends Office
{
	void Manage()
	{
	System.out.println("Manage team");
	}
}
class Teamleader extends Manager
{
	void Guiding()
	{
	  System.out.println("Team management");
}
}
	 
	 class Test3
	 {
		 public static void main(String[] args)
		 {
			//Teamleader t=new Teamleader();
			Manager t=new Teamleader();
			t.Work();
			t.Manage();
			//t.Guiding();
		 }
	 }