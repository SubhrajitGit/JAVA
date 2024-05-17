class Demo{
    String name;
    int age;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Demo{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
   
}
public class ToString{
        public static void main(String[] args){
            Demo ob = new Demo();
            ob.age = 12;
            ob.name = "Pabitra";
            System.out.println(ob);
        }
}