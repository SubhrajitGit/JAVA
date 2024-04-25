package CoreJava.Array;

public class JaggedArray {
    public static void main(String[] args) {
        int jaggedArray[][]= new int[3][];
        jaggedArray[0] =new int[3];
        jaggedArray[1] =new int[4];
        jaggedArray[2] =new int[2];

        for(int i = 0 ; i< jaggedArray.length ; i++)
        {
            for(int j = 0 ; j< jaggedArray[i].length ; j++)
            {
                jaggedArray[i][j] = (int) (Math.random()*100);
            }
        }
        //Print Array
        for(int i = 0 ; i< jaggedArray.length ; i++)
        {
            for(int j = 0 ; j< jaggedArray[i].length ; j++)
            {
               System.out.println(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
