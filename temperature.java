import java.util.*;
public class temperature {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temprature");
        double temp=sc.nextDouble();

        if(temp>100)
        {
            System.out.println("You have Fever");
        }

        else{
            System.out.println("You are Fine");
        }
sc.close();
    }
}
