
import java.util.Scanner;

public class BinaryTreeDemo 
{
     BTNode root;
 
     class BTNode
     {    
         BTNode left, right;
         int data;
     
         public BTNode()
         {
             left = null;
             right = null;
             data = 0;
         }
         
         public BTNode(int n)
         {
             left = null;
             right = null;
             data = n;
         }
     }
     
     public BinaryTreeDemo()
     {
         root = null;
     }
     
     public boolean isEmpty()
     {
         return root == null;
     }
     
     public void insert(int data)
     {
         root = insert(root, data);
     }

     private BTNode insert(BTNode node, int data)
     {
         if (node == null)
             node = new BTNode(data);
         else
         {
             if (data>node.data)
             {
                 if(node.right==null)
                 node.right = insert(node.right, data);
                 else
                 insert(node.right, data);
             }
             else if(data<node.data)
             {
                 if(node.left==null)
                 node.left = insert(node.left, data);             
                 else
                 insert(node.left, data);
             }
         }
         return node;
     }     
     
     public int countNodes()
     {
         return countNodes(root);
     }
     
     private int countNodes(BTNode r)
     {
         if (r == null)
             return 0;
         else
         {
             int count = 1;
             count += countNodes(r.left);
             count += countNodes(r.right);
             return count;
         }
     }
     
     public boolean search(int val)
     {
         return search(root, val);
     }
     
     private boolean search(BTNode r, int val)
     {
         if (r.data == val)
             return true;
         if (r.left != null)
             if (search(r.left, val))
                 return true;
         if (r.right != null)
             if (search(r.right, val))
                 return true;
         return false;         
     }
     
     public void inorder()
     {
         inorder(root);
     }
     private void inorder(BTNode r)
     {
         if (r != null)//true
         {
             inorder(r.left);
             System.out.print(r.data +" ");
             inorder(r.right);
         }
     }
     
     public void preorder()
     {
         preorder(root);
     }
     private void preorder(BTNode r)
     {
         if (r != null)
         {
             System.out.print(r.data +" ");
             preorder(r.left);             
             preorder(r.right);
         }
     }
     
     public void postorder()
     {
         postorder(root);
     }
     
     private void postorder(BTNode r)
     {
         if (r != null)
         {
             postorder(r.left);            
             postorder(r.right);
             System.out.print(r.data +" ");
         }
     }
 
     public static void main(String[] args)
    {            
        Scanner scan = new Scanner(System.in);
        BinaryTreeDemo bt = new BinaryTreeDemo(); 
        
        System.out.println("Binary Tree Test\n");          
        char ch;        
        do    
        {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("5. Inorder");
            System.out.println("6. Preorder");
            System.out.println("7. Post Order");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                bt.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bt.search( scan.nextInt() ));
                break;                                          
            case 3 : 
                System.out.println("Nodes = "+ bt.countNodes());
                break;     
            case 4 : 
                System.out.println("Empty status = "+ bt.isEmpty());
                break;            
            case 5 : 
                System.out.print("\nIn order : ");
                bt.inorder();
                break;            
            case 6 : 
                System.out.print("\nPre order : ");
                bt.preorder();
                break;            
            case 7 : 
                System.out.print("\nPost order : ");
                bt.postorder();
                break;            
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
}
