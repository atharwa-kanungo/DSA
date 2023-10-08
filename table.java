import java.util.*;
public class table {

    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number for Table");
    int num=sc.nextInt();

    for(int i=1;i<=10;i++)
    {
        int mul=num*i;
        System.out.println(num + "*" + i + "=" +  mul);
    }

    sc.close();
}    
}