public class Sqare{

static int Square(int n){
 
int a, b, c;
    a = (n * (n + 1) * (2 * n + 1)) / 6;
    b = (n * (n + 1)) / 2;
    b = b * b;
    c = Math.abs(a - b);
     
    return c;
 
}

public static void main(String args[])
{
    int n = 5000;
    System.out.println(Square(n));     
     
}
}