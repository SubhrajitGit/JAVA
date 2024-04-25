public class trePreorder {
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
    void preOrder(BT root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+"->");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void main(String[] args) {
        trePreorder.BT ob2=new trePreorder.BT(6);
        trePreorder.BT ob1=new trePreorder.BT(5);
        trePreorder.BT ob3=new trePreorder.BT(4);
        trePreorder.BT ob4=new trePreorder.BT(2);
        trePreorder.BT ob5=new trePreorder.BT(1);

        ob1.left=ob4;
        ob1.right=ob2;

        ob4.left=ob5;
        ob4.right=ob3;

        trePreorder ob=new trePreorder();
        ob.preOrder(ob1);

    }
}
