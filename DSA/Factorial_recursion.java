import java.util.*;
public class Factorial_recursion {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=ob.nextInt();
        int result = fact(n);
        System.out.println("The result :"+result);
       
    }
    private static int fact(int n)
    {
        if(n==1)
            return 1;
        else{
            return n*fact(n-1);
        }
    }
}
