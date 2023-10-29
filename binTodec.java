public class binTodec {
    public static void binTodecs(int binum) {

        int mynum=binum;
        int dec=0;
        int pow=0;

        while(binum>0)
        {
            int ld=binum%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            binum=binum/10;
        }

        System.out.println("Decimal of"+ mynum+"="+dec);
    }

    public static void main(String args[])
    {
binTodecs(101);
    }
}
