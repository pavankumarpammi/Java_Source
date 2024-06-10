package Recurrsion_Backtracking;

import java.util.ArrayList;

public class SubSets {
    static ArrayList<Integer> lis =new ArrayList<>();
    static ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    public static void func(int ind,int arr[])
    {
        if(ans.indexOf(lis)==-1){
            ans.add(new ArrayList<>(lis));
        }
        for(int i=ind;i<arr.length;i++)
        {
            if(i!=ind && arr[i]==arr[i-1]) continue;
            lis.add(arr[ind]);
            func(ind+1,arr);
            lis.remove((lis.size()==0)?0:lis.size()-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,7,9};
        func(0, arr);
        System.out.println(ans);
    }
}


/* for(int i=ind;i<arr.length;i++){
 * if(i!=ind && arr[i]==arr[i-1])continue;
 *  lis.add(arr[ind]);
 * func(ind+1,arr);
 * lis.remove(lis.size()-1);
} */