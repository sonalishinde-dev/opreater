package opreatre;

public class Ladder {

	public static void main(String[] args) { 
		
		int amount = 2000000;
		
		if(amount>0 && amount<=100000)
		{
			System.out.println("low balance");
		}
		else if(amount>100001 && amount<=300000)
		{
			System.out.println("minimum balance");
		}
		else if(amount>300001 && amount<=500000)
		{
			System.out.println("middle balance");
		}
		else if(amount>500000)
		{
			System.out.println("maximum balance");
		}
		
		else
		{
			System.out.println("invalid balance");
		}
		}
	}


