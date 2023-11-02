import java.util.*;
 class ForEach{

     public static void main(String []args){
        System.out.println("Hello, World!");
        int ar[] = new int[5];
        for(int i=0;i<5;i++)
        {
            Scanner ob =new Scanner(System.in);
            ar[i]=ob.nextInt();
        }
        System.out.println("Array elements:");
        for(int ele:ar)
        {   
            if(ele <=0){
            //System.out.println(ele)
             ele=0;}
            System.out.println(ele);
        }
     }
}