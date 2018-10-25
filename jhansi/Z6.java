package jhansi;

public class Z6 {
	static int i = test();
	static
	{
		System.out.println("Z6.SIB");
	}

	public static void main(String[] args) {
		System.out.println("Z6.main" + i);
		// TODOto-generated method stub

	}
	public static int test()
	{
		System.out.println("Z6.test()");
		return 69;
	}

}
