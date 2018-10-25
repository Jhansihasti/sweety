package jhan;

public class J14 {
	static int x = 10;
	static void test() {
	x = 40;
	J14.x = 60;
	System.out.println(x);
}
	public static void main(String[] args) {
		System.out.println("main:" + x);
		test();
		System.out.println("main end:" + x);
		// TODO Auto-generated method stub

	}

}
