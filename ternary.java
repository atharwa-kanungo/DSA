import java.util.*;
public class ternary {
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks=sc.nextInt();

        String type=(marks>33)?"Pass":"Fail";
        System.out.println(type);
        sc.close();
    }
}
