package practice;

public class LearnPolymorphism2 implements LearnInterface {

    @Override
    public void add() {
        System.out.println("I am in Polymorphism Class");

    }

    public static void main(String[] args) {

        LearnInterface learnInterface = new LearnPolymorphism2();
        learnInterface.add();
    }

}
