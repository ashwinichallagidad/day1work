class StringUtil { 
     public static String reverse(String str) 
     { String reversed = ""; 
      for (int i = str.length() - 1; i >= 0; i--)
       { reversed = reversed + str.charAt(i); 
       } 
       return reversed;
        } 
    public static void main(String[] args)
     { 
        System.out.println("Reverse of 'Hello' = " + reverse("Hello")); 
        System.out.println("Reverse of 'Java' = " + reverse("Java")); 
        System.out.println("Reverse of 'Encapsulation' = " + reverse("Encapsulation")); 
     }
 }