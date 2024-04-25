import java.util.Scanner;

class TreeCreation{
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
public class inOrderPredecessor {
    TreeCreation root;
    public inOrderPredecessor()
    {
        root=null;
    }
    void insert(int data)
    {
        root=insertFirst(root, data);
    }
    public TreeCreation insertFirst(TreeCreation root,int data)
    {
        TreeCreation Node=new TreeCreation(data);
        if(root==null)
        {
            root=Node;
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
    void predecessor(int Find)
    {
        TreeCreation sucess=FindPredecessor(root,Find);
        System.out.println("Predecessor is:"+sucess.data);
    }
    public TreeCreation FindPredecessor(TreeCreation root,int Find)
    {
        TreeCreation temp=root;
        TreeCreation predecessor=null;
        while(temp.data!=Find)
        {
            if(root.data>Find)
            {
                temp=temp.left;
            }
            else{
                predecessor=temp;
                temp=temp.right;
            }
        }
        //predercesor
        TreeCreation leftTree=temp.left;
        while(leftTree!=null)
        {
            predecessor=leftTree;
            leftTree=leftTree.right;
        }

        return predecessor;
    }
    public static void main(String[] args) {
        int Find;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to find  Sucessor");
        Find=sc.nextInt();
        inOrderPredecessor io=new inOrderPredecessor();
        io.insert(6);
        io.insert(4);
        io.insert(5);
        io.insert(3);
        io.insert(1);
        io.predecessor(Find);
        sc.close();
    }
}
