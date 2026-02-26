class SumofNaturalNumbers{
    public static void main(String []args)
    {
        int N=10;
        int i;
        int sum=0;
        for(i=0;i<=N;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first" + N + "natural numbers is:"+sum);
    }
}