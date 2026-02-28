class Product{
    private String productName; 
    private double price;
    public Product(String name, double p) 
    { productName = name; price = p;
     }
    public String getProductName() {
         return productName; 
         }
    public void setProductName(String name) { 
            productName = name; 
            }
    public double getPrice() { 
            return price;
            }
    public void setPrice(double p)
         { if (p >= 0) 
            { 
                price = p;
             }
           else 
             { 
                System.out.println("Price cannot be negative!");
             }
         }
    public void displayProductDetails() 
    { System.out.println("Product Name: " + productName); 
    System.out.println("Price: " + price);
     }
 }
 public class ProductTest 
 {
     public static void main(String[] args) 
     { 
         Product prod = new Product("Laptop", 75000); 
         prod.displayProductDetails();
         prod.setProductName("Gaming Laptop"); 
         prod.setPrice(85000);  
         prod.displayProductDetails(); 
         prod.setPrice(-5000);
     }
 }

