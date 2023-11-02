// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the no of rows:");
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        // int b = ob.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(j==0||j==(a-1)||i==(a-1)/2){
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