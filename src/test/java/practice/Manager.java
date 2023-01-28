package practice;

public class Manager extends Members {

    public static void main(String[] args) {

        String specialization = "Manger";
        String department = "HR";

        name = "Sarker Rashid";
        age = 30;
        phoneNumber = "3473208855";
        address = "1045 Boston Rd, Greensboro, NC, USA";
        salary = 1000000;
        Members members = new Members();

        members.printSalary(specialization, department);

    }
}
