import java.util.Scanner;
public class Jp_7a {
    public static void main(String[] args) {
        int c;
        Scanner ob = new Scanner(System.in);
        int a,b;
        a = ob.nextInt();
        b = ob.nextInt();
        try{
            c = a/b;
            System.out.println("Result is:"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero:"+e);
        }
        System.out.println("After the catch block");
    }
}
