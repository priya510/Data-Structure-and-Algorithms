

public class Node 
{
    int data;
    Node link;
    
    public Node()
    {
        link = null;
        data = 0;
    }    
    
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    } 
}
