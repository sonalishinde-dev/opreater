package opreatre;

public class Arithmatic2 {

	public static void main(String[] args) {

        int a = 10;
        int b = 5; 
        ++a;
        --b;
        

        System.out.println("Addition: " + (a + b));       // Output: 15
        System.out.println("Subtraction: " + (a - b));    // Output: 7
        System.out.println("Multiplication: " + (a * b)); // Output: 44
        System.out.println("Division: " + (a / b));       // Output: 2
        System.out.println("Modulus: " + (a % b));        // Output: 3(remainder of 11/4)
        System.out.println("Operation: "+(a+(a--)-(++b)+(--b)));
                                          //11+11-5+4=21
	}

	}


