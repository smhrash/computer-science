package practice;

public class Employee extends Members{

    public static void main(String[] args) {

        String specialization = "Employee";
        String department = "HR";

        name= "Mike Burket";
        age = 43;
        phoneNumber = "929-333-8855";
        address = "1055 Ellis Ave, Bronx, NY 10372";
        salary = 70000;

        Members members = new Members();
        members.printSalary(specialization, department);
    }
}
