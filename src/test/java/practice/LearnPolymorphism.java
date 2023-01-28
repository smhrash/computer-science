package practice;

public class LearnPolymorphism implements LearnInterface{


    @Override
    public void add() {
        System.out.println("I am interface class");

    }

    public static void main(String[] args) {
        LearnInterface learnInterface = new LearnPolymorphism();
        learnInterface.add();
    }
}
