package Recurrsion_Backtracking;
import java.util.ArrayList;

public class possibleSubSequence {
    public static void printPath(int arr[],int index,ArrayList<Integer> tempArr)
    {
        if(index==arr.length)
        {
            if(tempArr.size()>0)
            {
                System.out.println(tempArr);
            }
            return ;
        }
        printPath(arr, index+1, tempArr);
        tempArr.add(arr[index]);
        printPath(arr, index+1, tempArr);
        tempArr.remove(tempArr.size()-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printPath(arr, 0,new ArrayList<>());

    }
}
