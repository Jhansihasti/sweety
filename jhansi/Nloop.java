package jhansi;

public class Nloop {

	public static void main(String[] args) {
		int i = 0;
		do
		{
			System.out.println("begin");
			i++;
			if(i>3)
			{
				break;
			}
			System.out.println("end");
		}
		while(i < 10);
		// TODO Auto-generated method stub

	}

}
