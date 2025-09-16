package opreatre;

public class For_loop3 {

	public static void main(String[] args) {

		int sum=0;
		for(int num=0;num<=30;num++) {
			
			if(num%2==0)
			{
				System.out.println(num); 
				sum=sum+num;
				
			}
		}
		System.out.println(sum);
	}

}
