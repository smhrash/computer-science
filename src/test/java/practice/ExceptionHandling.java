package practice;

public class ExceptionHandling {

    public static void main(String[] args) {
        int i = 12;
        int j = 2;
        try {
            int result = i / (j - 2);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            // Error: / by zero ex.printStackTrace();
            // Helpful during app development } }
        }
    }
}
