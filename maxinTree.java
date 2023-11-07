import java.util.LinkedList;
import java.util.Queue;

public class maxinTree 
{
    static class BT{
        int data;
        BT left;
        BT right;

        public BT(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    int max(BT root)
    {
        Queue<BT>q1=new LinkedList<>();
        q1.add(root);
        q1.add(null);
        int max=root.data;
        while(!q1.isEmpty())
        {
            BT temp=q1.remove();
            if(temp==null)
            {
            System.out.println();
            if(q1.isEmpty())
            {
                break;
            }
            else
            {
                q1.add(null);
            }
            }
            else{
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                {
                    q1.add(temp.left);
                    if(max<temp.left.data)
                    {
                        max=temp.left.data;
                    }
                }
                if(temp.right!=null)
                {
                    q1.add(temp.right);
                    if(max<temp.right.data)
                    {
                        max=temp.right.data;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        maxinTree lo=new maxinTree();
        maxinTree.BT b1=new BT(1);
        maxinTree.BT b2=new BT(2);
        maxinTree.BT b3=new BT(3);
        maxinTree.BT b4=new BT(4);
        maxinTree.BT b5=new BT(5);
        maxinTree.BT b6=new BT(6);

        b1.left=b2;
        b1.right=b3;

        b2.left=b4;
        b2.right=b5;

        b3.right=b6;

        int max=lo.max(b1);
        System.out.println("Maximum value is->"+max);
}
}