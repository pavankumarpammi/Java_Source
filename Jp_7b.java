import java.util.Scanner;
public class Jp_7b {
    public static void main(String[] args) {
        int c;
        Scanner ob = new Scanner(System.in);
        int a,b;
        a = ob.nextInt();
        b = ob.nextInt();
        try{
            int ar[]=new int[3];
            ar[6]=0;
           
            c = a/b;
            System.out.println("Result is:"+c);
        
            
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Array out of index"+ex);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero:"+e);
        }
        
        System.out.println("After the catch block");
    }
}
