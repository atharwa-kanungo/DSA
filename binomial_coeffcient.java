import java.util.*;
public class binomial_coeffcient {
    
    public static int factorial(int n)
    {
        int f=1;

        for(int i=1;i<=n;i++){

            f=f*i;
        }

        return f;
    }

    public static int bicoeff(int n,int r)
    {
        int a=factorial(n);
        int b=factorial(r);
        int c=factorial(n-r);

        int bc=a/(b*c);

        return bc;

    }

    public static void main(String[] args)
    {
Scanner sc = new Scanner(System.in);
System.out.println("Enter n and r");
int n=sc.nextInt();
int r=sc.nextInt();
System.out.println("Binomial Coefficient is " + bicoeff(n,r));
sc.close();
    }
}
