class Human{
    private int age;
    private String Name;
    //Using Constructor we can assign private member Value
    public Human() {
        age = 12;
        Name = "Hari" ;
    }
    
    public Human(int age, String name) {
        this.age = age;
        Name = name;
    }

    @Override
    public String toString() {
        return "Human [age=" + age + ", Name=" + Name + "]";
    }
    
}
public class DefaultConstructor {
        public static void main(String[] args){
          Human h1 = new Human();
          Human h2 = new Human(25,"Radhe");
          System.out.println(h1);   
          System.out.println(h2);        
        }
}