import java.sql.Array;
import java.util.*;
public class Duplicate{
        public static void main(String[] args){
             Scanner sc = new Scanner(System.in);   
             int n = sc.nextInt();
             int place=0;  
             int[] arr = new int[n];
             int[] temp = new int[n];
             for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
             }  
             for(int j =0;j<n-1;j++)
             {
                if(arr[j]!=arr[j+1])
                {
                    temp[place] = arr[j];
                    place++;
                }
             }
             temp[place]=arr[n-1];
             for(int k=0;k<temp.length;k++)
             {
                System.out.print(temp[k]+",");
             }
        }
}