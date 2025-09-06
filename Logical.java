package opreatre;

public class Logical {

	public static void main(String[] args) {
		
		
		int a = 10;
        int b = 5;
		int c = a;
		
		 //Assignment Operators
       
        System.out.println("c = " + c);
        c += b; // Compound assignment (c = c + b)
        System.out.println("c after += b: " + c); 
        
        System.out.println("c =" +b);
        c -= b;
        System.out.println("c befor -= b: " + c); 
       
        System.out.println("c =" +a);
        c += a;
        System.out.println("c = " +a);
         
        System.out.println("c =" +a);
        c= -a;
        System.out.println("c =" +b);
        
        



	}

}
