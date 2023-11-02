// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the no of rows:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        // int b = ob.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==0&&j>0&&j<(n-1)/2)||(j==0&&i>0)||(i==(n-1)/2 && j<=(n-1)/2)||(j==(n-1)/2&&i>0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}