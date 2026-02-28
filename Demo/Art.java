class Person {
    private int age;  
    Person(int age) {
        setAge(age);  
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative. Setting age to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
    public void displayDetails() {
        System.out.println("Age: " + age);
    }
}

public class Art  {
    public static void main(String[] args) {
        Person person1 = new Person(25);
        person1.displayDetails();
        Person person2 = new Person(-5);
        person2.displayDetails();
        person2.setAge(30);
        person2.displayDetails();
    }
}
