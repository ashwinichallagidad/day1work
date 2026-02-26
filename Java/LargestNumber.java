class LargestNumber{
    public static void main(String[]args)
    {
        int a=20,b=32,c=45;
        if(a>=b && a>=c)
        {
            System.out.println("The given number is largest:"+a);
        }
        else if(b>=a && b>=c)
        {
            System.out.println("The given number is largest:"+b);
        }
        else
        {
            System.out.println("The given number is largest:"+c);
        }

    }
    
}