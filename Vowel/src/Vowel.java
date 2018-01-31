import java.util.*;

class Vowel
{
	public static void main(String[ ] arg)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a letter to find if it is vowel : ");
	char c=s.next( ).charAt(0);	 		
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
	System.out.println("Entered character "+c+" is  Vowel"); 
	}
	else if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		System.out.println(+c+" is not vowel");
	      else
		System.out.println("not alphabet");		
	}
}