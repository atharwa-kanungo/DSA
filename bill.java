import java.util.*;
public class bill {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cost of Pencil");
        float pnc=sc.nextInt();
        System.out.println("Enter Cost of Pen");
        float pen=sc.nextInt();
        System.out.println("Enter Cost of Eraser");
        float ers=sc.nextInt();
        float bill=pnc+pen+ers;
        System.out.println("Bill of the items "+bill);

        float newbill=(bill+(0.18f*bill));
        System.out.println("Bill of the items "+newbill);
        sc.close();

    }
}
