//  import java.util.*;
//  class Sol {
//     public static void Possbilities(int curr,int n,String str)
//     {
//         if(curr>n)
//         {
//             return;
//         }
//         if(curr==n)
//         {
//             System.out.println(str);
//             return;
//         }
//         Possbilities(curr+1,n,str+="1");
//         Possbilities(curr+2,n,str+="2");
//         Possbilities(curr+3,n,str+="3");
//         Possbilities(curr+4,n,str+="4");
//         Possbilities(curr+5,n,str+="5");
//         Possbilities(curr+6,n,str+="6");
//     }
//    public static void main(String[] args) {
//     Scanner ob=new Scanner(System.in);
//     //int n=ob.nextInt();
//     int n=9;
//     Possbilities(0, n,"");

//    } 
// }
import java.util.*;

class Sol {
    public static void Possbilities(int curr,int n,StringBuilder str)
    {
        if(curr > n)
        {
            return;
        }
        if(curr == n)
        {
            System.out.println(str);
            return;
        }
        Possbilities(curr+1,n,str.append("1"));
        str.setLength(str.length()-1);
        Possbilities(curr+2,n,str.append("2"));
        str.setLength(str.length()-1);
        Possbilities(curr+3,n,str.append("3"));
        str.setLength(str.length()-1);
        Possbilities(curr+4,n,str.append("4"));
        str.setLength(str.length()-1);
        Possbilities(curr+5,n,str.append("5"));
        str.setLength(str.length()-1);
        Possbilities(curr+6,n,str.append("6"));
        str.setLength(str.length()-1);
    }
   public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    //int n=ob.nextInt();
    int n=9;
    StringBuilder str = new StringBuilder();
   }
}