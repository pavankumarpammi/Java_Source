

import java.util.*;
class Stringex1 {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1= ob.next();
        // System.out.println(a);
        // System.out.println("Hello, World!");
        String sar[]=str1.split(" ");
        String str2="";
        for(int i=sar.length-1;i>=0;i--)
        {  
            str2 = str2+sar[i]+" ";
            System.out.println(str2);
            // for(int j=lis[i];j>=0;j--)
            // {
            //   b=b+sar.charAt(i);  
            // }
            
        }
         System.out.println(str2);
    }
}