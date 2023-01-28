package practice;

public class Graded {

    public static float radius = 10f;
    public static void main(String[] args) {
        // Print Statement to be inserted here

        System.out.println(Circle.circumference(2*radius));

    }
}

class Circle {
    public static float circumference(float diameter) {
        // please note how the calculation has changed from the previous example
        return 3.14f * diameter;
    }

}
