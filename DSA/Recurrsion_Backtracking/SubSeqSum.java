package Recurrsion_Backtracking;
import java.util.*;

public class SubSeqSum {
    public static int seq(int ind,int[] arr,ArrayList<Integer>lis,int k,int sum)
    {
        if(ind >=arr.length)
        {
            if(sum==k){
                System.out.println(lis);
                return 1;       //Bilnd mark structure for returing the count of subsequenc
            }                   //That sum==k the return 1 to function call seq() at the end
                                //each of iteration value stored in l and r 
            else  return 0;
        }
       
        int l=seq(ind+1, arr, lis, k, sum);
        lis.add(arr[ind]);
        sum+=arr[ind];
        int r=seq(ind+1, arr, lis, k, sum);
        sum-=arr[ind];
        lis.remove(lis.size()-1);
        return l+r;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,1};
        System.out.println(seq(0, arr,new ArrayList<>(),20 , 0));

    }
}
