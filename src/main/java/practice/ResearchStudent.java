package practice;

class ResearchStudent extends Student {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent(String name, int year, String researchArea, BankAccount bankAccount) {
        super(name, year, bankAccount);
        this.researchArea = researchArea;
    }
}
