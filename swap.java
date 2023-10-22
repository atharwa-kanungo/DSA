public class swap {

    public static void swaper(int a,int b) 
    {
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a is " + a);
        System.out.println("b is "+ b);

    }
    
    public static void main(String[] args)
    {
        int a=5;
        int b=10;
        swaper(a,b);

       
    }
}
