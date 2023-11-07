public class TreeCreation {
    int data;
    TreeCreation left;
    TreeCreation right;
    public TreeCreation(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinarySearchTree
{
    TreeCreation root;
    public BinarySearchTree()
    {
        root=null;
    }
    void inOrder(TreeCreation root)
    {
        if(root==null)
        {
            return;
        }
        else{
            inOrder(root.left);
            System.out.print(root.data+"->");
            inOrder(root.right);
        }
    }
    public TreeCreation insertFirst(TreeCreation root,int data)
    {
        TreeCreation newTree=new TreeCreation(data);
        if(root==null)
        {
            root=newTree;
            return root;
        }
        else if(data<root.data)
        {
            root.left=insertFirst(root.left, data);
        }
        else
        {
            root.right=insertFirst(root.right, data);
        }
        return root;
    }
    void insert(int data)
    {
        root=insertFirst(root, data);
    }
    public static void main(String[] args) {
        BinarySearchTree b1=new BinarySearchTree();
        b1.insert(5);
        b1.insert(6);
        b1.insert(4);
        b1.insert(3);
        b1.insert(1);
        b1.inOrder(b1.root);
    }
}
