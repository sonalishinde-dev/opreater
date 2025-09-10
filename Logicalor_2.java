package opreatre;

public class Logicalor_2 {

	public static void main(String[] args) {

		int num1=-19,num2=+20,num3=24;
		
		boolean con1= (num1++ >= num3 &&( num3<=num1));

		boolean con2 =(num2 >= num1 || num3 <= num1);
		
		System.out.println((con1) ||con2 && (!con2));
		 
		

		
	
	
	

}
}