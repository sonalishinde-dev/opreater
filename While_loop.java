package opreatre;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		
        //ICBO
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter your number:");
		int number = scr.nextInt();
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println(number + " x " + i + " = " + (number * i));
			i++;
		
		}
		scr.close();
	} 


}