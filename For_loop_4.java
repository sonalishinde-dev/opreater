package opreatre;

public class For_loop_4 {

	public static void main(String[] args) {

		for(int i=2;i<20;i++)
		{
			boolean flag=true;
			
			for( int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag==true)
			{
			System.out.println(i);
			}
		}
		
		
	}

}
