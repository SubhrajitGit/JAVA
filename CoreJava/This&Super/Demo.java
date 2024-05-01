//Constructor Cn Call Only First Line Of a Statement
class A{//class A extends Object
    public A(){
        super();//Every Class Java Extends Object Class
        System.out.println("In A");
    }
    public A(int n)
    {
        // 
        this();
        System.out.println("Int A");
    }
}
class B extends A{
    public B(){
        // super();//Calling Default Constructor of A || If we Do not use Super() keyword By default Java call Default Constructor of Class A
        super(5);
        System.out.println("In B");
    }
    public B(int n)
    {
        // super(n);
        this();//this constructor call the Defaiult Constructor Of B() || Extecute Constructor Of Same Class
        System.out.println("Int B");
    }
}
public class Demo {
    public static void main(String[] args) {
        B b1 = new B(5);
    }
}
