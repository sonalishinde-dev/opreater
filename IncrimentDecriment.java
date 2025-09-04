package opreatre;

public class IncrimentDecriment {

	public static void main(String[] args) {

		int val=10;
		
		val++;
		--val;
		++val;
		
		System.out.println(val+(--val)-(++val)+(--val));
		
		System.out.println(val);
		
	}
}
