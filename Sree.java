
 class Sri {
	static {
		System.out.println("Sri.SIB");
		
	}
	static void test( ) {
		System.out.println("Sri.test()");
	}
}
class Sri1 {
	static {
        System.out.println("Sri1.SIB");
	}
	public static void main(String[] args) {
		System.out.println("Sri.main begin");
		Sri.test();
		System.out.println("-------");
		Sri.test();
		System.out.println("-------");
		

		// TODO Auto-generated method stub

		
	}
	

}
