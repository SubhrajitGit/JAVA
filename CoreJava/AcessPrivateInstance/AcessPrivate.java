//Acess Private member using getter seter in inheritance
class Parent{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class AcessPrivate  extends Parent{
   public static void main(String[] args) {
    AcessPrivate ac1 = new AcessPrivate();
    ac1.setName("Stuff");
    System.out.println(ac1.getName());
   }
}

