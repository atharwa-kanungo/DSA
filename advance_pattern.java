public class advance_pattern{

    public static void hollowRectangle(int totrows,int totcols)
    {
        
        for(int i=1;i<=totrows;i++)
        {
            for(int j=1;j<=totcols;j++)
            {
                if(i==1 || j==1 || j==totcols|| i==totrows)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n)
    {
            for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=n-i; j++)
                {
                    System.out.print(" ");

                }

                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }
    }

    public static void inverted_half_pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i+1);j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydstriangle(int n)
    {
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();

        }
    }

    public static void triangle01(int n)
    {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print("1");
                    }

                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
    }

    public static void butterfly(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }


    }

    public static void solidrhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowrhombus(int totrows,int totcols)
    {
        for(int i=1;i<=totrows;i++)
        {   
            for(int j=0;j<=totrows-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=totcols;j++)
            {
                if(i==1 || j==1 || j==totcols|| i==totrows)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
System.out.println();
        }
    }

    public static void diamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
System.out.println();
        }
    }

    public static void numberpyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        hollowRectangle(10,10);
        System.out.println();
        inverted_rotated_half_pyramid(10);
        System.out.println();
        inverted_half_pyramid(10);
        System.out.println();
        floydstriangle(8);
        System.out.println();
        triangle01(8);
        System.out.println();
        butterfly(10);
        System.out.println();
        solidrhombus(8);
        System.out.println();
        hollowrhombus(7,7);
        System.out.println();
        diamond(8);
        System.out.println();
        
    }
}