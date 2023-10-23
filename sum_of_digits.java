import java.util.*;
public class sum_of_digits {

    public static void sumint(int n)
    {
        int sum=0;

        while(n>0)
        {
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
            
        }
        System.out.println("Sum of Digits is "+sum);

    }
    
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number ");
            int num=sc.nextInt();

            sumint(num);
            sc.close();
    }
}
