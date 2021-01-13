
public class LinearSearchDemo 
{
	public static void main(String[] args) 
	{
		boolean status=false;
		int arr[]= {4,5,10,8,7,9};
		int searchValue=10;
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==searchValue)
			{
				status=true;
				break;
			}
		}
		
		if(status)
		{
			System.out.println("We found value at "+(i+1)+" position");
		}
		else
		{
			System.out.println("Value is Not present in the list");
		}
	}
}
