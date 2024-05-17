class A {
    public void show() {
        System.out.println("In A");
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class B extends A {

    public void show() {
        System.out.println("In B");
    }

    @Override
    public int add(int n1, int n2) {
        return n1 + n2+1;
    }

}

public class Demo {
    public static void main(String[] args) {
        // B b1 = new B();
        A b1 = new B();  
        System.out.println(b1.add(5, 3));
        b1.show();
    }
}
//Method Overriding Is A run time polymorphism