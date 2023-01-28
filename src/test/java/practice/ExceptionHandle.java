package practice;

public class ExceptionHandle {

    public static void main(String[] args) {
        int i = 12;
        int j = 2;
        try {
            int result = i / (j - 2);
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("Invalid math operation - " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
