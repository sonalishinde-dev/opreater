package opreatre;

import java.util.Scanner;

public class Ladder2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter your amount");
		double price= sc.nextDouble();
		
		if(price > 0 && price <= 100000)
		{
			System.out.println("Your amount:-"+price);
			System.out.println("final amount:-"+(price*10)/100);
		}
		else if(price>100000 && price <= 200000)
		{
			System.out.println("Your amount:-"+price);
			System.out.println("final amount:-"+(price*20)/100);
		}
		else if(price>200000 && price <= 300000)
		{
			System.out.println("Your amount:-"+price);
			System.out.println("final amount:-"+(price*30)/100);
		}
		else if(price >300000 && price<=400000)
		{
		System.out.println("Your amount:-"+price);
		System.out.println("final amount:-"+(price*40)/100);
		}
	    else  
	    {
	    	System.out.println("enter the valid amount");	
	    }
	    

}
}