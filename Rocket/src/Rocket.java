import java.util.Scanner;
public class Rocket {
	public static void main(String[] args) {
		System.out.println("Enter time in seconds : ");
		Scanner s=new Scanner(System.in);
		double time=s.nextDouble();
		double ac;
		double g=9.8;
		ac=g;
		double v=ac*time;
		double ht=(v*time)/2;
		System.out.println("Height reached by the rocket (in km) is : " +(ht/1000));
}
}