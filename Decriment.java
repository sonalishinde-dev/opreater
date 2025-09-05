package opreatre;

public class Decriment {

	public static void main(String[] args) {

		int num=20;
		
		num--;//20
		--num;//18
		num--;//17
		--num;//16
		
		System.out.println(num+(--num)+num+(num--)+(--num));
                        	
		
		System.out.println(num);
	}

}
