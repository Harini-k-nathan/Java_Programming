package basicweb;

public class Constructors_Demo {
	
	void sum(int a, int b){
		
		System.out.println(a+b);
		
	}
	
	public Constructors_Demo(){
		
		System.out.println("Hi, Hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructors_Demo obj1 = new Constructors_Demo();
		
		obj1.sum(5, 6);
		
	}

}
