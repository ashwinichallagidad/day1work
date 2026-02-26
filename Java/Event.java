class Student{
    int id;
    String name;
    void display(int a)
    {
        System.out.println(id+""+name);
    }
}
class Event
{
    public static void main(String[] args) {
        Student S1=new Student();
        S1.id=101;
        S1.name="TCE";
        S1.display(10);
        Student S2=new Student();
        S2.id=102;
        S2.name="ASH";
        S2.display(20);
    }
}