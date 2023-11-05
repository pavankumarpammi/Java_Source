import java.util.*;
class Sol {
    public static int SquareRoot(int num)
    {
        int result=0;
        int low =0,high=num-1;
        while(low<=high)
        {
            int mid =low+(high-low)/2;
            long val =mid*mid;
            if(val==num)
            {
                //prefect square root of given number
                return mid;
            }
            else if(val<num)
            {
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result =SquareRoot(num);
        System.out.println("The square root of "+num+":"+result);
    }
}
