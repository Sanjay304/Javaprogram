class Phyelements
{
	void Software()
	{
		System.out.println("Build software applications");
}
}
 class Rajesh extends Phyelements
 {
	 void Funder()
	 {
		 System.out.println("Management to the company");
	 }
 }

 class Sanjay extends Rajesh
 {
	 void Employee()
	 {
		 System.out.println("Working to the project");
	 }
 }

 class Test4
 {
	 public static void main(String[] args)
	 {
		Sanjay S=new Sanjay();
		S.Software();
		S.Funder();
		S.Employee();
	 }
 }