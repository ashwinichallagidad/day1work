class Student
{
    String name;
    int marks;
    int rollNo;
    void display()
    {
        System.out.println(name+""+marks+""+rollNo);
    }
}
public class Main{
    public static void main(String[] args) {
        Student S1=new Student();
        Student S2=new Student();
        S1.name="Ashwini";
        S1.marks=100;
        S1.rollNo=05;
        S2.name="Ammu";
        S2.marks=99;
        S2.rollNo=06;
        S1.display();
        S2.display();
    }
}