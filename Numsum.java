import java.util.*;
public class Numsum{

     public static void main(String []args){
        System.out.println("Hello, World!");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println(n);
        int c=0;
        int sum=0;
        int a;
        while(n>0){
            a=n%10;
            n=n/10;
            
      
            c++;
            sum+=a;
        }
        System.out.println(c);
        System.out.println(sum);

     }
}