class PrintArray
{
    public static void printArray(int[]arr)
    { 
        int i;
      for(i=0;i<arr.length;i++)
     {
        System.out.println(arr[i]);
     }
    }

    public static void main(String[]args)
    {
        int[]numbers={10,20,30,40,50};
        printArray(numbers);
    }
}