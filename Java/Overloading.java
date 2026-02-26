class Student{
    Student()
    {
        System.out.println("TCE");
    }
    Student(double a)
    {
        System.out.println("Float value:"+1.34);
    }
    Student(int a,int b)
    {
        System.out.println("Int value:"+10);
    }
}
class Overloading
{
  public static void main(String[] args) {
      Student S1=new Student();
      Student S2=new Student(1.34);
      Student S3=new Student(10,20);
  }
}