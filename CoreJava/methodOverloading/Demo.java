class A{
public int add(int n1,int n2)
{
    return n1+n2;
}
}
class B extends A{
    public int add(int n1, int n2 ,int n3) {
        return (n1+n2+n3);
    }
}
public class Demo {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.add(5, 3)+" "+b1.add(4, 3, 7));
    }
}
//Method Overloading Is A Compile Time PolyMorPhism