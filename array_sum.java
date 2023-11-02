class Sum{
 int add(int nums[])
{
 int result=0;
 for(int i:nums)
{ result= result+i;}
return result;
}
}


class Array{
public static void main(String args[])
{
 int nums[]={5,8,6,9,3};
 Sum ob = new Sum();
 int res = ob.add(nums);
 System.out.println("Sum of the elements are:"+res);
}
}