public class Jp_9c {
    public static void main(String[] args) {
        try{
            int ar[] = new int[4];
            ar[6] = 0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        { 
            System.out.print("The output is:");
            System.out.println(e);
        }
    }
}
