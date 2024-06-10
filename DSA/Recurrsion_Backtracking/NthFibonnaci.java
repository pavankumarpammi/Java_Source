package Recurrsion_Backtracking;
import java.util.*;
public class NthFibonnaci {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=ob.nextInt();
        int result =fib(n);
        System.out.println("The fibonacci "+n+" :"+result);
        ob.close();
    }
    private static int fib(int n){
        if(n==0||n==1)
        {
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    
}
