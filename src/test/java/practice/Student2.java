package practice;

public class Student2 {
    private final String name;
    private static int year;
    private static final int annualFees = 10000;

    public Student2 (String name, int year) {
        this.name = name;
        this.year= year;
    }
    public String getDetails() {
        return "Name : " + name;
    }
    public int computeFees () {
        return this.annualFees * Student2.year ;
    }
}
