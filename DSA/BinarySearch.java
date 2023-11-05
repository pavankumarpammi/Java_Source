import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        ArrayList<Integer> lis =new ArrayList<>();

        System.out.println("Enter the size:");
        int len =ob.nextInt();
        for(int i=0;i<len;i++)
        {
            lis.add(ob.nextInt());
        }
        System.out.println("Enter the target:");
        int target =ob.nextInt();
        int low =0;
        int high =len-1;
        int flag=0,mid=0;
        while(low<=high)
        {
             mid = low+(high-low)/2;
             //System.out.print(mid+":");
            if(target==lis.get(mid))
            {
                flag=1;
                System.out.println("Target fount at index :"+mid);
            }
            else if(target>lis.get(mid))
            {
                low = mid+1;
            }
            else if(target<lis.get(mid))
            {
                high =mid-1;
            }
        }
       // System.out.println(mid);
        ob.close();
        if(flag==0)
        {
            System.out.println("Element not found!");
        }
        
    }
}
