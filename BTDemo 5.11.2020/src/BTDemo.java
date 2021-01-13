
public class BTDemo 
{
	BTNode root;
	
	class BTNode
	{
		int data;
		BTNode left;
		BTNode right;
		
		BTNode(int data)
		{
			this.data=data;
		}
	}
	
	public BTNode insert(int data,BTNode node)
	{		
		if(node==null)
		{
			node=new BTNode(data);
		}
		else
		{
			if(data<node.data)
			{
				if(node.left==null)
					node.left=insert(data,node.left);
				else
					insert(data,node.right);
			}
			else
			{
				if(node.right==null)
					node.right=insert(data,node.right);
				else
					insert(data,node.left);
			}
		}
		return node;
	}
	
	public void insert(int data)
	{
		root=insert(data, root);
	}
	
	public static void main(String[] args) 
	{
		BTDemo bt=new BTDemo();
		bt.insert(8);
		bt.insert(9);
	}
	
}

