public class BalancedPrenthasis {
    public static void PrintBalancedParenthsis(int n,int oc,int cc,String str)
    {
        if(oc==n && cc==n)
        {
            System.out.println(str);
        }
        if(oc<n)
        {
            PrintBalancedParenthsis(n,oc+1,cc,str+"(");
        }
        if(oc>cc){
            PrintBalancedParenthsis(n,oc,cc+1,str+")");
        }
    }
    public static void main(String[] args) {
        PrintBalancedParenthsis(4,0,0,"");
    }
}
