class Movie 
{
 int seatno;
 String name;
 int rate;

  public static void main(String[] args)
	{
	 System.out.println("program started");
     Movie M1=new Movie();
	 M1.seatno=13;
	 M1.name="Dabang3";
	 M1.rate=180;
	 System.out.println("Movie Seatno:"+M1.seatno);
	 System.out.println("Movie Name:"+M1.name);
	 System.out.println("Movie Rate:"+M1.rate);
	 System.out.println("program ended");

	}
}