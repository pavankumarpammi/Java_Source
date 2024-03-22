import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the No of Values:");
        int num=ob.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            int val=ob.nextInt();
            arr[i]=val;
        }
        //System.out.println("Given array is : ");
        ob.close();
         int min_idx=0;
        for(int i=0;i<num;i++)
        {
            min_idx=i;
            int j=0;
            while(j<num)
            {
                if(arr[j]<arr[min_idx])
                {
                    swapping(arr,j,min_idx);
                    //min_idx=j;
                }
                j++;
            }
        }
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    private static void swapping(int[] arr,int j, int min_idx) {
        // int temp =arr[j];
        // arr[j]=arr[min_idx];
        // arr[min_idx]=temp;
        int temp =arr[min_idx];
        arr[min_idx]=arr[j];
        arr[j]=temp;
    }
}
