import java.util.*;
public class avg_fun {
        public static float average(float a,float b,float c)
        {
            float sum=a+b+c;
            float avg=sum/3;
            return avg;
        }

        public static void main(String args[])  
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 3 Numbers") ;
            float a=sc.nextInt();
            float b=sc.nextInt();
            float c=sc.nextInt();
            float avg=average(a,b,c);
            System.out.println("Average is " + avg);
sc.close();
        }
}
