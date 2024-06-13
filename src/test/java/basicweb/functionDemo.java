package basicweb;

public class functionDemo {
	
	
	// parameterized function
	void getcoco(int money)
	{
		System.out.println(money);
		System.out.println("Chocolate purchased");
	}
	
	void getpow(int money)
	{
		System.out.println(money);
		System.out.println("Powder purchased");
		
	}
	
	int sum(int a, int b)
	{
		return a+b;
	}
	
	void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	void mul(int a, int b)
	{
		System.out.println(a*b);
	}

	void div(int a, int b)
	{
		System.out.println(a/b);
	}
	
	String getName()
	{
		String name = "Harini";
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		functionDemo obj1 = new functionDemo();
		obj1.getcoco(10);
		obj1.getpow(30);
		
		int total = obj1.sum(30, 40);
		System.out.println(total);
		
		obj1.sub(80, 20);
		obj1.mul(2,8);
		obj1.div(80,10);
		
		String myname = obj1.getName();
		System.out.println(myname);
		
		
	}

}
