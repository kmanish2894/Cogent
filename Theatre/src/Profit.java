import java.util.*;

public class Profit {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of attendes for show : ");
	int a=s.nextInt();
	double onecost = 20 ;
	double atndcost =0.5;
	double p = (5*a) - (a*atndcost+20);
	System.out.println("Profit is "+p);
}
}