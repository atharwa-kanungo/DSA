import java.util.Scanner;

public class area_circle {
    
    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);
        float rad=sc.nextFloat();
        float ar=3.14f*rad*rad;
        System.out.println("Area circle"+ ar);
        sc.close();

    }
}
