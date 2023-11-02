import java.util.*;
class Anagram {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
       String a = scan.nextLine();
       String b = scan.nextLine();
       a =a.toLowerCase();
       b =b.toLowerCase();
       a = a.replace(" ","");
       b = b.replace(" ","");
       char ar1[] = a.toCharArray();
       char ar2[] = b.toCharArray();
       Arrays.sort(ar1);
       Arrays.sort(ar2);
       if(Arrays.equals(ar1,ar2))
       {
           System.out.println("It is a anagram");
       }
       else{
           System.out.println(ar1);
           System.out.println(ar2);
           System.out.println("Not a anagram");
       }
    }
}