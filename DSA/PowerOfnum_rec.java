import java.util.*;
public class PowerOfnum_rec {
    public static long power(long a ,long b)
    {
        if (b == 0) return 1;
        else{
            return a*power(a, b-1);
        }
    }
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the number a , b:");
        long a=ob.nextInt();
        long b=ob.nextInt();
        System.out.println("Power of "+a+" to "+b+ " is :"+power(a, b));
        ob.close();
    }
}
