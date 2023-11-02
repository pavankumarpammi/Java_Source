import java.util.*;
class Palindrome {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
       String a = scan.next();
       String b = "";
       for(int i= a.length()-1;i>=0;i--){
           b=b+a.charAt(i);
       }
       System.out.println(b.equals(a));
        System.out.println(b);
    }
}