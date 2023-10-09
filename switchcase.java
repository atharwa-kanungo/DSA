import java.util.*;
public class switchcase {
    public static void main(String args[])
    {
        System.out.println("Select to Order");
        System.out.println("1.Samosa");
        System.out.println("2.burger");
        System.out.println("3.shake");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1: System.out.println("Samosa Orderd");
            break;
            case 2: System.out.println("Burger Orderd");
            break;
            case 3: System.out.println("Shake Orderd");
            break;
            default:
            System.out.println("Order From Above");

        }
sc.close();
    
    }
    
}
