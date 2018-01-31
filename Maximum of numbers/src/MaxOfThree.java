import java.lang.Math;
import java.util.*;


public class MaxOfThree {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = Integer.parseInt(s.nextLine());
		int b = Integer.parseInt(s.nextLine());
		int c = Integer.parseInt(s.nextLine());
		
		int max = Math.max(a,b);
		if(max>b) {
			max=Math.max(a, c);
			
		}
		else {
			max = Math.max(b, c);
			
		}
		System.out.println("Maximum number is:" +max);
	}
}
