class A{
    public A()
    {
        System.out.println("Object Created");
    }
    public void show()
    {
        System.out.println("Show method");
    }
}
public class Demo {
    public static void main(String[] args) {
        // A ob = new A();
        // ob.show();
        new A();//AnoNymous Object || Object Do Not Have Name
        new A().show();
    }
}
