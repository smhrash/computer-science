package practice;

class PhdStudent extends ResearchStudent {
    private String thesisTitle;
    private static final int annualFees = 10000;

    public PhdStudent(String name, int year, String researchArea, String thesisTitle, BankAccount bankAccount) {
        super(name, year, researchArea, bankAccount);
        this.thesisTitle = thesisTitle;
    }
}
