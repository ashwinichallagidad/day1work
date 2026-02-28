class College {
    private String collegeName;
    private int totalStudents;
    College(String collegeName, int totalStudents) {
        this.collegeName = collegeName;
        this.totalStudents = totalStudents;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public int getTotalStudents() {
        return totalStudents;
    }
}

public class Cls {
    public static void main(String[] args) {
        College college1 = new College("ABC Engineering College", 1200);
        College college2 = new College("XYZ Medical College", 800);
        System.out.println("College Name: " + college1.getCollegeName());
        System.out.println("Total Students: " + college1.getTotalStudents());
        System.out.println("College Name: " + college2.getCollegeName());
        System.out.println("Total Students: " + college2.getTotalStudents());
    }
}
