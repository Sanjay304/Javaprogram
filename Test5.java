class Sports
{
	void Playing()
	{
		System.out.println("Sports is good for health");
	}
}

class Cricket extends Sports
{
  void Batting()
	{
	  System.out.println("Virat make a century");
	}
}

class Football extends Sports
{
	void Goal()
	{
		System.out.println("Messi Kick a goal");
	}
}

class Test5
{
	public static void main(String[] args)
	{
	  Football f=new Football();
	  f.Playing();
	  f.Goal();
	}
}
