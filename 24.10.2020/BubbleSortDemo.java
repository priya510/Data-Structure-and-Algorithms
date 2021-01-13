
package bubblesortdemo;

public class BubbleSortDemo 
{
    public static void main(String[] args) 
    {
        int arr[]={4,5,3,2};
        
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr.length-1-i; j++) 
            {
                if(arr[j]<arr[j+1])
                {
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
        
        for (int i : arr) 
        {
            System.out.println(i);
        }
    }
}
