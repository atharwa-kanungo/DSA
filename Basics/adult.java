import java.util.*;
public class adult {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("Adult:Vote,Drive");
        }

        else if(age>13 && age<18)
        {
            System.out.println("Teenager");
        }

        else
        {
            System.out.println("Not Adult");
        }
        sc.close();
    }
}
