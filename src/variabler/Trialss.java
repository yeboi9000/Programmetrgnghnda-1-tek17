package variabler;
import java.util.*;
public class Trialss {

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
        System.out.print("Input a float number: 12.34 ");
        float  x = in.nextFloat();  
        System.out.printf("The absolute value of %.2f is: %.2f",x, convert(x));
		System.out.printf("\n");
    }

    public static float convert(float n)
	{
		float absvalue = (n >= 0) ? n : -n;
		return absvalue;
		
		
		
	}

}
