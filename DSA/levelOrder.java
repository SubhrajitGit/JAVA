import java.util.LinkedList;
import java.util.Queue;
public class levelOrder {
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
    void LOT(BT root)
    {
        Queue<BT>q1=new LinkedList<>();
        q1.add(root);
        q1.add(null);
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
                }
                if(temp.right!=null)
                {
                    q1.add(temp.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        levelOrder lo=new levelOrder();
        levelOrder.BT b1=new BT(1);
        levelOrder.BT b2=new BT(2);
        levelOrder.BT b3=new BT(3);
        levelOrder.BT b4=new BT(4);
        levelOrder.BT b5=new BT(5);
        levelOrder.BT b6=new BT(6);

        b1.left=b2;
        b1.right=b3;

        b2.left=b4;
        b2.right=b5;

        b3.right=b6;

        lo.LOT(b1);
    }
    
}
