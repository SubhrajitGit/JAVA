public class stac {
    protected int top;
    private int size=10;
    int arr[]=new int[size];
    public stac()
    {
        top=-1;
    }
    boolean isFull()
    {
        if(top==size-1)
        {
            return true;
        }
    return false;
    }
    boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
    return false;
    }
    void insert(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
        }
        else
        {
            top++;
            arr[top]=data;
        }
    }
    
    void delete()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            int data=arr[top];
            top--;
            System.out.println("Popeed Element is->"+data);
        }
    }

    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else{
            for(int i=top;i>=0;i--)
            {
                System.out.print(arr[i]);
                System.out.print("<-");
            }
            System.out.println("Null");
        }
    }
    public static void main(String[] args) {
        stac ob=new stac();
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.insert(4);
        ob.insert(5);

        ob.display();

        ob.delete();

        ob.display();

        ob.delete();

        ob.display();

        ob.delete();

        ob.display();
        
    }
    
}
