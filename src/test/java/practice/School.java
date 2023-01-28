package practice;

public class School {

    private String name;
    private int numStudents;

    public School(String name, int numStudents) {
        this.name = name;
        this.numStudents = numStudents;
    }

    public String getName() {
        return this.name;
    }

    public int getNumStudents() {
        return this.numStudents;
    }
}
