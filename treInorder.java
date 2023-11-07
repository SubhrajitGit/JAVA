public class treInorder {
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
    void inOrder(BT root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }
    
    public static void main(String[] args) {
        treInorder.BT ob1=new treInorder.BT(5);
        treInorder.BT ob2=new treInorder.BT(6);
        treInorder.BT ob3=new treInorder.BT(4);
        treInorder.BT ob4=new treInorder.BT(2);
        treInorder.BT ob5=new treInorder.BT(1);

        ob1.left=ob4;
        ob1.right=ob2;

        ob4.left=ob5;
        ob4.right=ob3;

        treInorder ob=new treInorder();
        ob.inOrder(ob1);

    }
}
