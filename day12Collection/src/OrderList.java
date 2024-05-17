import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class order{
    private String name;
    private int amount;

    public order(String name,int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
public class OrderList {
    public static void main(String[] args) {
        order o1 = new order("A",100);
        order o2 = new order("B",200);
        order o3 = new order("C",300);
        order o4 = new order("D",400);
        order o5 = new order("E",500);
        List <Object> ol = new ArrayList();
        ol.add(o1);
        ol.add(o2);
        ol.add(o3);
        ol.add(o4);
        ol.add(o5);
        Iterator it = ol.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
