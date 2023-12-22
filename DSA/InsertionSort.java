public class InsertionSort {
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSort(int arr[])
    {
        //int j=0;
        for(int j=0;j<arr.length;j++)
        {
        
            while (j>0 && arr[j]<arr[j-1]) {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
    
        int[] array = {9, 4, 7, 2, 10};
        System.out.println("Original Array: ");
        printArray(array);
        System.out.println("\nInsertion Sort Array:");
        insertionSort(array);
        printArray(array);
    }
}
