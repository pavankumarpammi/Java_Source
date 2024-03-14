import java.util.HashMap;

public class countDup {
    public static void main(String[] args) {
        int arr[]={2,5,2,1,4,5,6,7,1};
        int maxi=0;
        for(int ele:arr)
        {
            maxi=Math.max(maxi,ele);
        }
        //System.out.println(maxi);
        // int countArr[]=new int[maxi];
        // for(int i=0;i<countArr.length;i++){
        //     if(countArr[i]>=0)
        //     {
        //         countArr[i]++;   
        //     }
        //     if(countArr[i]>=2)
        //     {
        //         System.out.print(countArr[i]+"");
        //     }
        HashMap<Integer,Integer> hs =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i]))
            {
                int val =hs.get(arr[i]);
                hs.put(arr[i],val+1);
            }
            else{
                hs.put(arr[i],1);
            }

        }
        for(int key : hs.keySet())
        {
            if(hs.get(key)>1){
                System.out.print(key+" ");
            }
        }
        }
    }

