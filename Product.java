class Product
{
  String name;
  int price;
  String color;
 
  public static void main(String[] args)
	{
	 System.out.println("main method started");
     Product P1=new Product();
	 P1.name="Santoor";
	 P1.price=45;
	 P1.color="Orange";
	 System.out.println("Product Name:"+P1.name);
	 System.out.println("Product Price:"+P1.price);
	 System.out.println("Product Color:"+P1.color);
	 System.out.println("main method ended");
	}
}
