package practice;

public class Members {

    static String name;
    static int age;
    static String phoneNumber;
    static String address;
    static int salary;


    public void printSalary(String position, String dept) {

        /**
         * Create a class named 'Member' having the following members: Data members 1 - Name 2 - Age 3 - Phone number
         * 4 - Address 5 - Salary It also has a method named 'printSalary' which prints the salary of the members.
         * Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager'
         * classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number,
         * address and salary to an employee and a manager by making an object of both of these classes and print the same.
         */
        System.out.println(position);
        System.out.println(dept);
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(address);
        System.out.println(salary);

    }
}
