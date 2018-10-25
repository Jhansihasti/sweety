package jhansi;

public class Zdual {
	static int i = 10; 
	static {
		System.out.println("Zdual.SIB:"+ i);
		i = 20;
		
	}
}
class Zdual1 {
	static {
		System.out.println("Zdual1.SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("Zdual.i");
		System.out.println("-------");
		System.out.println("Zdual.i");
		System.out.println("-------");
		System.out.println("main end");
		
		// TODO Auto-generated method stub

	}

}



