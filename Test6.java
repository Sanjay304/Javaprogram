class Bank
	{  
     float getRateOfInterest(){return 0;}  
}  
class SBI extends Bank
	{  
     float getRateOfInterest(){return 8.5f;}  
}  
class ICICI extends Bank
	{  
     float getRateOfInterest(){return 7.5f;}  
}  
class AXIS extends Bank
	{  
     float getRateOfInterest(){return 9.5f;}  
}  
class Test6
	{  
public static void main(String args[])
	{  
     Bank b;  
     b=new SBI();  
     System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
      b=new ICICI();  
      System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
      b=new AXIS();  
      System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
}  
}  