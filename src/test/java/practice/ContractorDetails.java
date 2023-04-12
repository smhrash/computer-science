package practice;

public class ContractorDetails {

    String name;
    int pincode;
    int mobileNumber;
    int aadhar;
    String address;
    char gender;
    String email;
    double balance;
    int accNo;

    public ContractorDetails(String name, int pincode, int mobileNumber, int aadhar, String address, char gender, String email, double balance, int accNo) {
        this.name = name;
        this.pincode = pincode;
        this.mobileNumber = mobileNumber;
        this.aadhar = aadhar;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.balance = balance;
        this.accNo = accNo;
    }

    public ContractorDetails() {
    }

    void deposit(double amount) {
        balance = balance +amount;
        System.out.println("Deposit successfull");
    }

    double withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdraw successfull");
        return balance;
    }

    public static void main(String[] args) {
        ContractorDetails vishalAccount = new ContractorDetails("Vishal", 3434, 42334, 54353, "dfdfs", 'm', "sddsf", 0.0, 45);
        System.out.println(vishalAccount.aadhar);
        System.out.println(vishalAccount.balance);
        vishalAccount.deposit(1234.56);
        System.out.println(vishalAccount.balance);
        vishalAccount.withdraw(100.00);
        System.out.println(vishalAccount.balance);
    }
}
