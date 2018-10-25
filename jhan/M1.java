package jhan;

public class M1 {
	static int i;
	static
	{
		
		System.out.println("M1.SIB");
	}
}

class M2 {
	static {
		System.out.println("M2.SIB");
	}
public static void main(String[] args)
{
		System.out.println("main begin");
		System.out.println(M1.i);
		System.out.println("main end");
		// TODO Auto-generated method stub

}

}
