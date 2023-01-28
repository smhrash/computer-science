package practice;

public class Student3 {

    private final String name;
    private final int rollNumber;

    public Student3(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';

    }
}
