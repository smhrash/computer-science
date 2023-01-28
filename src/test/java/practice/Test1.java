package practice;

public class Test1 extends Demo1{

    public void set(int a)
    {
        this.a = a;
    }

    final public void get()
    {
        System.out.println("a = " + a);
    }

    public static void main(String[] args)
    {
        Test1 obj = new Test1();
        obj.set(2);
        obj.get();
    }
}
