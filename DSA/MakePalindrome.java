import java.util.*;
class Palindrome{
    public boolean checkPalindrome(String str)
    {
        String str0=str;
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        if(str0.equals(str1))
        {
            return true;
        }
        return false;
    }
}
public class MakePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        Palindrome p =new Palindrome();
        if(p.checkPalindrome(str))
        {
            System.out.println("Palindrome");
            System.out.println(str);
            sc.close();
            return ;
        }
        Stack<Character> s =new Stack<>();
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(s.size()!=0 && s.peek()==ch){
            s.pop();
        }
        else{
            s.push(ch);
        }
        }
        int n=s.size();
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(s.pop());
        }
        if(n!=str.length())
        {
            System.out.println(sb+str);
        }
        else{
            sb.deleteCharAt(n-1);
            System.out.println(sb+str);
        }
    sc.close();
    }
}
