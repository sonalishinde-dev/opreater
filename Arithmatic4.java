package opreatre;

public class Arithmatic4 {

	public static void main(String[] args) {
		
		int a = 10;
        int b = 5;

      // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

      //Assignment Operators
        int c = a; // Simple assignment
        System.out.println("c = " + c);
        c += b; // Compound assignment (c = c + b)
        System.out.println("c after += b: " + c);

      //Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a > b: " + (a > b));   // Greater than

      //Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR

      //Ternary Operators
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
	}

}
