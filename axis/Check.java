class Calc{
    public String div(int a,int b)
    {
        try {
            int res = a/b;
            return "try block";
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            return "catch block";
        }
        finally{
            System.out.println("Final Block");
        }
    }
}
public class Check{
        public static void main(String[] args){
            Calc ob = new Calc();
            System.out.println(ob.div(5, 0));
        }
}