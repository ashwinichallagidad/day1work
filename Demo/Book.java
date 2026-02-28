class One{
    String title;
    String author;
    double price;
    One(String title ,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;

    }
    void displayDetails()
    {
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
        System.out.println();
    }

}
public class Book{
    public static void main(String[] args) {
        One one1=new One("The Great Gatsby", "F.Scott Fitzgerald",499.0);
        One one2=new One("1984","George Orwell",399.0);
         one1.displayDetails();
         one2.displayDetails();
    }
}