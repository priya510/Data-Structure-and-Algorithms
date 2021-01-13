
public class BinarySearchDemo 
{
	static int binarySearch(int arr[], int l, int u, int x) 
    { 
        if (u >= l)
        { 
            int mid = (l+u)/2;
            if (arr[mid] == x) 
                return mid; 
        
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            return binarySearch(arr, mid + 1, u, x); 
        } 
  
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = {2, 3, 4, 10}; 
        int n = arr.length; 
        int x = 3; 
        int result = binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}
