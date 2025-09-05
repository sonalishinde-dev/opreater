package opreatre;

public class Arithmatic3 {

	public static void main(String[] args) {

		double a=20.0d;
		double b=10.0d; 
		--a;//19
		++b;//11
			
		System.out.println(a+(--b)+(++a)-(a--));
		                  //19+10+20-20=29
		
		float c=5.0f;
		float d=3.0f;
		c--;//5
		d--;//3
		
		System.out.println(c+(c--)+(++d)-(--c));
                           //4+4+4-3=9	
	}

}
