class Human{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class Demo {
    public static void main(String[] args) {

        // Due TO Private We Can Not Acess In This Way

        Human ob1 = new Human();
        // ob1.name = "Suvam";
        // System.out.println(ob1.name);

        //Now Using Getter And Setter We Can Acess Instance Of Private Instance
        
         ob1.setName("Harry");
         System.out.println("Name is ->"+" "+ob1.getName());
         ob1.setAge(22);
         System.out.println("Age is ->"+" "+ob1.getAge());

        
    }
}
