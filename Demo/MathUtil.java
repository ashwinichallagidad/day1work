class MathUtil { 
    public static int power(int base, int exponent)
     { int result = 1; 
      for (int i = 1; i <= exponent; i++)
       { result = result * base; 
        }
       return result; 
       } 
    public static void main(String[] args)
        { System.out.println("2^5 = " + power(2, 5)); 
          System.out.println("3^4 = " + power(3, 4)); 
          System.out.println("5^0 = " + power(5, 0));
        } 
}
