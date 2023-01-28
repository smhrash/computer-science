package practice;

public class ResearchStudent {

    private final String name;
    private static int year;
    private static final int annualFees = 10000;
    String researchArea;

    public ResearchStudent (String name, int year, String researchArea) {
        this.name = name;
        this.year= year;
        this.researchArea = researchArea;
    }

    public String getDetails() {
        return "Name : " + name;
    }

    public int computeFees( ) {
        return this.annualFees * ResearchStudent.year ;
    }
}
