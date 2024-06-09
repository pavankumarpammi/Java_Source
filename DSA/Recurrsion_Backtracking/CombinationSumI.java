package Recurrsion_Backtracking;
import java.util.*;
//Here the combination sum will accepte the duplicate numbers
class ReptSubSeqSumDup {
    static List<List<Integer>> ans =new ArrayList<>();
    static ArrayList<Integer> lis =new ArrayList<>();
    public static void seq(int ind,int[] arr,int k,int sum)
    {
        if(ind==arr.length)
        {
            if(k==0)
            {
                ans.add(new ArrayList<>(lis));
            }
            return ;
        }
        if(arr[ind]<=k)
        {
            lis.add(arr[ind]);
            seq(ind, arr,k-arr[ind], sum);//here ind select one number until it reach the target
            lis.remove(lis.size()-1);
        }
        seq(ind+1, arr, k, sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,8,5};
        seq(0, arr,10 , 0);
        System.out.println(ans);
    }
}
