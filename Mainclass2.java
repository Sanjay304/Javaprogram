class Developer
{
	
  int id;
  String name;
  double salary;
 Developer(int id,String name,double salary)
	{
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
}
void details()
	{
	System.out.println("Employee ID:"+id);
	System.out.println("Employee Name:"+name);
	System.out.println("Employee Salary:"+salary);
	}
}

class Manager
{
	void increaseSalary(Developer arg,double amt)
	{
	 System.out.println("Increments salary of Mr"+arg.name+"by Rs"+amt);
	 //arg.Salary=arg.Salary+amt;
	}
}
    class Mainclass2{
		public static void main(String[] args)
	{
	
	 System.out.println("program started");
	 Manager Mgr1=new Manager();
	 Developer Dev1=new Developer(1213,"Sanjay",15000.00);
	 Dev1.details();
	 Mgr1.increaseSalary(Dev1,5000.00);
	 Dev1.details();
	 System.out.println("program ended");

}
	}
	
