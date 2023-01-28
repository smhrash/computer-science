package practice;

public class Student {
    public int rollno;
    public String name;
    public double cgpa;

    // Declare constructor
    public Student(int rollno, String name, double cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }


}
