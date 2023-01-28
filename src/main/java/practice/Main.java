package practice;

class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(111, 1000);
        BankAccount account2 = new BankAccount(222, 2000);
        BankAccount account3 = new BankAccount(333, 3000);

        Student s1 = new Student("karan", 3, account1);
        System.out.println(s1.getDetails());
        ResearchStudent s2 = new ResearchStudent("siddharth", 4, "Software Engineering", account2);
        System.out.println(s2.getDetails());
        PhdStudent s3 = new PhdStudent("hari", 1, "Software Engineering", "Automated Evaluation", account3);
        System.out.println(s3.getDetails());
    }
}
