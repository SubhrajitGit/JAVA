import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> a1= new ArrayList<>();
        a1.ensureCapacity(10);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(9);
        a1.add(10);
        a1.add(21);
        a1.add(22);
        a1.add(23);
        Iterator itr = a1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
//       for (int i : a1)
//       {
//           System.out.println(i);
//       }
    }
}


//Array List
/*
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ageList = new ArrayList(500); //Size is dynamic
		int ageArray[] = new int[10]; //Fixed in size
		//Array stores the data in primitive data type
		//Collection stores the data in Objects only
		ageList.ensureCapacity(500);
		ageArray[0] = 15;
		ageArray[1] = 9;
		ageArray[3] = 12;
		ageArray[4] = 21;
		ageArray[6] = 8;
		ageList.add(3);
		ageList.add(8);
//		ageList.add(5,15);
		ageList.add(7);
		ageList.add(36);
		ageList.add(21);
		ageList.add(45);
//		ageList.add(15,75);


		System.out.println("Age Array :" +ageArray);
		System.out.println("Age List :" +ageList);

		//Using simple for loop
		System.out.print("Age Array :");
		for (int i=0;i<ageArray.length;i++) {
			System.out.print(ageArray[i]+" ");
		}
		System.out.print("\nAge List :");
		for (int i=0;i<ageList.size();i++) {
			System.out.print(ageList.get(i)+" ");
		}

		//Using Enhanced for loop (or) forEach
		System.out.println("\nUsing Enhanced for loop");
		System.out.print("Age Array :");
		for (int i : ageArray) {
			System.out.print(i+" ");
		}
		//AutoBoxing & Unboxing
		System.out.print("\nAge List :");
		for (Object i : ageList) {
			System.out.print(i+ " ");
		}


	}

}*/