package Recurrsion_Backtracking;

import java.util.ArrayList;

public class permutation {
    static ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    static ArrayList<Integer> lis=new ArrayList<>();
    public static void func(int ind,int arr[],boolean fre[])
    {
        if(lis.size()==arr.length)
        {
            if(ans.indexOf(lis)==-1){
                ans.add(new ArrayList<>(lis));
            }
            
            return ;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!fre[i])
            {
                fre[i]=true;
                lis.add(arr[i]);
                func(ind, arr, fre);
                lis.remove(lis.size()-1);
                fre[i]=false;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,3,6,8,1};
        boolean fre[]=new boolean[arr.length];
        func(0,arr,fre);
        System.out.println(ans);
        System.out.println(ans.size());
    }
}
