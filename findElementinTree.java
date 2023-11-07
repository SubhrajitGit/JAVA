import java.util.LinkedList;
import java.util.Queue;

public class findElementinTree {
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
    int find(BT root,int element)
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
                if(temp.data==element)
                {
                    return 1;
                }
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
        return 0;
    }
    public static void main(String[] args) {
        findElementinTree lo=new findElementinTree();
        findElementinTree.BT b1=new BT(1);
        findElementinTree.BT b2=new BT(2);
        findElementinTree.BT b3=new BT(3);
        findElementinTree.BT b4=new BT(4);
        findElementinTree.BT b5=new BT(5);
        findElementinTree.BT b6=new BT(6);

        b1.left=b2;
        b1.right=b3;

        b2.left=b4;
        b2.right=b5;

        b3.right=b6;

        int element=8;
        int found=lo.find(b1,element);
        if(found==1)
        {
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
        }
}
}
