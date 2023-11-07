import java.util.Scanner;

public class stairCasePattern {
    void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Value of N:");
        n=sc.nextInt();
        stairCasePattern ob1=new stairCasePattern();
        ob1.pattern(n);
    }
}
