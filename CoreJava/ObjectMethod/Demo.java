class Laptop{
    private int price;
    private String Name;
    public Laptop(int price,String Name)
    {
        this.Name = Name;
        this.price = price;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((Name == null) ? 0 : Name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (Name == null) {
            if (other.Name != null)
                return false;
        } else if (!Name.equals(other.Name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Laptop [price=" + price + ", Name=" + Name + "]";
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(1000, "mac");
        Laptop l2 = new Laptop(500, "msi");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.hashCode());
        System.out.println(l1.equals(l2));
    }
}
