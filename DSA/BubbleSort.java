import java.util.*;
public class BubbleSort {
    public static void printArray(int arr[],int n)
    {
        System.out.print("pass :"+n+"->");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                int temp=0;
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            printArray(arr,i);
            
        }
    }
   public static void main(String[] args) {
    Scanner ob =new Scanner(System.in);
    int n=0;
    System.out.println("Enter the number of elements you want in array");
    n=ob.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=ob.nextInt();
    }
    bubbleSort(arr);
    System.out.print("The sorted array is ->");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");

    }
   } 
}
