package practice;

public class TestClass {

    public static void main(String[] args) {
        int i = 12;
        int j = 2;
        try {
            int result = i / (j - 2);
            System.out.println(result);
        } catch (Exception e) {
            throw new OwnException(e.getMessage());
        }

    }
}

