package jhansi;

public class Z9 {
	static int i = test();
	
	static
	{
		System.out.println("Z9.sib:" + i);
		i = 99;
		main(null);
		System.out.println("Z9.sib again:" + i);
		i = 10;
	}
	
	

	public static int test() {
		System.out.println("test:" + i);
		i = 40;
		main(null);
		System.out.println("test again:" + i);
		return 75;
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
	
		System.out.println("main begin:" + i);
		i = 33;
		System.out.println("main end:" + i);
	}

}
