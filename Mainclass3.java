class Mobile
{
	void sim(int a)
	{
		System.out.println("Running only one sim");
	}
    void sim(int b)
	{
		System.out.println("Running dual sim");
	}
}
 class Mainclass3
 {
	 public static void main(String[] args)
	 {
		 Mobile m1=new Mobile();
		 m1.sim(1);
		 m1.sim(1,2);
	 }

 }