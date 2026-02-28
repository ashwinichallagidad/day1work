class Rectangle
{
      double  length;
      double   width;
      Rectangle(double l,double w)
      {
        length=l;
        width=w;
      }
      double area()
      {
        return length*width;
      }

     public static void main(String[] args) {
        Rectangle r =new Rectangle(20,40);
        
        System.out.println("Area="+r.area());
    }
}