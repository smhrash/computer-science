package practice;

public class University extends School{
    private final String type = "University";
    private boolean isPublic;

    public University(String name, int numStudents, boolean isPublic) {
        super(name, numStudents);
//        this.name = name;
//        this.numStudents = numStudents;
        this.isPublic = isPublic;
    }

    public boolean getIsPublic() {
        return this.isPublic;
    }
}
