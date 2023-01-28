package practice;

class Student {

    private final String name;
    private int year;
    private BankAccount bankAccount;

    private static final int annualFees = 10000;

    public Student(String name, int year, BankAccount bankAccount) {
        this.name = name;
        this.year = year;
        this.bankAccount = bankAccount;
    }

    public String getDetails() {
        return "Name : " + name + '\n' +
                "Fees : " + computeFees();
    }

    public int computeFees() {
        return Student.annualFees * year;
    }
}
