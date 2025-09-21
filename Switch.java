package opreatre;

public class Switch {

	public static void main(String[] args) {

		String day="thusday";
		switch(day)
		{
		case  "saturday":
		{
			System.out.println("hurray------saturday");
			break;
		}
		case " friday":
		{
			System.out.println("today is friday");
			break;
		}
		case "thusday":
		{
			System.out.println( "today is thusday");
			break;
		}
		default :
		{
			System.out.println("unknown day");
		}
		}
	}

}
