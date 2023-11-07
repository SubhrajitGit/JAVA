public class trePostorder {
    static class BT
    {
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
    void postOrder(BT root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"->");
    }
    
    public static void main(String[] args) {
        trePostorder.BT ob1=new trePostorder.BT(5);
        trePostorder.BT ob2=new trePostorder.BT(6);
        trePostorder.BT ob3=new trePostorder.BT(4);
        trePostorder.BT ob4=new trePostorder.BT(2);
        trePostorder.BT ob5=new trePostorder.BT(1);

        ob1.left=ob4;
        ob1.right=ob2;

        ob4.left=ob5;
        ob4.right=ob3;

        trePostorder ob=new trePostorder();
        ob.postOrder(ob1);

    }
    
}
