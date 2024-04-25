class LL
{
    Node head;
    protected int size;
    LL()
    {
        size=0;
    }
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=newNode; 
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    void addLast(int data)
    {
        Node newNode=new Node(data);
        Node curr=head;
        size++;
        if(head==null)
        {
            System.out.println("No Node Avilable");
            head=newNode;
        }
        else
        {
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    void printNode()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("No Node Avilable");
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("No Node Avilable");
        }
        else
        {
            head=head.next;
            size--;
        }
    }
    void deleteLast()
    {
        Node curr=head;
        Node second=head.next;
        if(head==null)
        {
            System.out.println("No Node Avilable");
        }
        else
        {
            while(second.next!=null)
            {
                second=second.next;
                curr=curr.next;
            }
            curr.next=null;
        }
    }
    void insertAtindex(int data,int position)
    {
        Node newNode=new Node(data);
        Node curr=head;
        if(position==0)
        {
            newNode.next=head;
        }
        for(int i=0;i<position-1;i++)
        {
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    public static void main(String[] args) {
        LL ob=new LL();

        ob.addFirst(4);
        ob.printNode();

        ob.addFirst(3);
        ob.printNode();

        ob.addFirst(2);
        ob.printNode();

        ob.addFirst(1);
        ob.printNode();

        // ob.addLast(5);
        // ob.printNode();

        // ob.addLast(6);
        // ob.printNode();

        // ob.deleteFirst();
        // ob.printNode();

        // ob.deleteLast();
        // ob.printNode();

        ob.insertAtindex(7, 2);
        ob.printNode();
    }
}