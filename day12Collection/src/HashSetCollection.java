import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCollection {
    public static void main(String[] args) {
        Set <String> st = new HashSet<String>();
        st.add("Suvendu");
        st.add("Pabitra");
        st.add("Raja");
        st.add("Surya");
        st.add("JEJA");

        //enhanced For Loop
//        for(String name : st)
//        {
//            System.out.println(name);
//        }

        //Iterator
        Iterator it = st.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
