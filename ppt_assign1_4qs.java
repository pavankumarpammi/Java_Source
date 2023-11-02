 class Sol1{
    public void merge(int nums1[],int nums2[])
    {
        int m =nums1.length;
        int n =nums2.length;
        int set_zero = m-n;
        int j=0;
        //System.out.println(set_zero+" "+m+" "+n);
        for(int i=set_zero;i<m;i++)
        { 
            nums1[i]=nums2[j];
            j++;
            //System.out.println(nums1[i]);
        }
        int maxi =nums1[0];
        int mini =nums1[0];
        for(int i=1;i<nums1.length;i++)
        {
            maxi = Math.max(maxi,nums1[i]);
            mini = Math.min(mini,nums1[i]);
            if(nums1[i]>maxi)
            {
                maxi =nums1[i];
            }
            if(nums1[i]<mini)
            {
                mini =nums1[i];
            }
        }
        System.out.println(maxi+"  "+mini);
    }
    
 }
 class Qs4{
  public static void main(String[] args) {
    int nums1[]={1,2,3,0,0,0};
    int nums2[]={2,5,6};
    Sol1 obj = new Sol1();
    obj.merge(nums1,nums2);
    for(int val:nums1)
    {
        System.out.print(val+" ");
    }
  }
}
