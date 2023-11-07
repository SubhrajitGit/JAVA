public class que {
    private int front;
    private int rear;
    private int size=10;
    int[] arr=new int[size];
    public que()
    {
        front=-1;
        rear=-1;
    }
    void insert(int data)
    {
        if(rear==size-1 && front==0)
        {
            System.out.println("Queue is full");
        }
        else{
            if(front==-1)
            {
                front=0;
            }
                rear++;
                arr[rear]=data;
                System.out.println("Element Insert Sucessfully");
        }
    }

    void delete()
    {
        if(rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        else{
            if(front>=rear)
            {
                rear=-1;
                front=-1;
            }
            else{
                int data=arr[front];
                front++;
                System.out.println("Item Popped Sucessfully->"+data);
            }
        }
    }

    void display()
    {
        if(front==-1)
        {
            System.out.println("Queue is Empty");

        }
        else{
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]);
                System.out.print("<-");
            }
        }
    }
    public static void main(String[] args) {
        
        que ob=new que();

        ob.insert(5);
        ob.insert(4);
        ob.insert(3);
        ob.insert(2);
        ob.insert(1);

        ob.display();

        ob.delete();

        ob.display(); 
    }
}
