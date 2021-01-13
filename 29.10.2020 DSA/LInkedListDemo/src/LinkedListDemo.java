


import java.util.Scanner;


public class LinkedListDemo 
{
    Node start;
    Node end;
    int size;
    
    public void insertAtPos(int val , int pos)
    {
        Node nptr = new Node(val, null);                
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.link ;
                ptr.link=nptr;
                nptr.link=tmp;
                break;
            }
            ptr = ptr.link;
        }
        size++ ;
    }
    
    public void insertAtBeginning(int data)
    {
        Node nptr = new Node(data, null);    
        size++ ;    
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else 
        {
            nptr.link=start;
            start = nptr;
        }
    }

    public void insertAtEnd(int data)
    {
        Node nptr = new Node(data,null);    
        size++ ;    
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else 
        {
            end.link=nptr;
            end = nptr;
        }
    }
    
     public void deleteAtPos(int pos)
     {        
        if (pos == 1) 
        {
            start = start.link;
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.link;
            }
            end = t;
            end.link=(null);
            size --;
            return;
        }
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos)
            {
                Node tmp = ptr.link;
                Node tmp2 = tmp.link;
                tmp.link=null;
                ptr.link=tmp2;
                
                break;
            }
            ptr = ptr.link;
        }
        size-- ;
        
        try
        {
            finalize();
        }
        catch(Throwable e)
        {
            System.out.println(e);
        }
    }    
     
    public void displayData()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.link == null) 
        {
            System.out.println(start.data);
            return;
        }
        Node ptr = start;
        System.out.print(start.data+ "->");
        ptr = start.link;
        while (ptr.link != null)
        {
            System.out.print(ptr.data+ "->");
            ptr = ptr.link;
        }
        System.out.print(ptr.data+ "\n");
    }
    
    
    public static void main(String[] args) 
    {
        LinkedListDemo ld=new LinkedListDemo();
        String s;
        do
        {
            Scanner sc=new Scanner(System.in);

            System.out.println("============MENU=============");
            System.out.println("1. Insert At Beginning");
            System.out.println("2. Insert At End");
            System.out.println("3. Display Data");
            System.out.println("4. Insert At Pos");
            System.out.println("5. Delete At Pos");
            System.out.println("Select one option");

            int n=sc.nextInt();

            int data;

            switch(n)
            {
                case 1:
                    System.out.println("Enter data");
                    data=sc.nextInt();
                    ld.insertAtBeginning(data);
                    System.out.println("Inserted successfully!!!");
                    break;

                case 2:
                    System.out.println("Enter data");
                    data=sc.nextInt();
                    ld.insertAtEnd(data);
                    System.out.println("Inserted successfully!!!");
                    break;

                case 3:
                    ld.displayData();;
                    break;

                case 4:
                    System.out.println("Enter data");
                    data=sc.nextInt();
                    System.out.println("Enter position");
                    int pos=sc.nextInt();
                    ld.insertAtPos(data,pos);
                    System.out.println("Inserted successfully!!!");
                    break;
                    
                case 5:
                    System.out.println("Enter position");
                    int p=sc.nextInt();
                    ld.deleteAtPos(p);
                    System.out.println("Deleted successfully!!!");
                    break;

            }
            System.out.println("Do you want to continue with this app?");
            s=sc.next();
        }while(s.equals("yes"));
    }
}
