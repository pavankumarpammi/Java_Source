class MycustomException
{

}
public class Jp_9d {
    public static void main(String[] args) {
        try{
            throw MycustomException();
        }
        catch(MycustomException ex)
        {
            System.out.println("caught exception");
            System.out.println(ex.getMessage());
        }
        System.out.println("rest of code");
    }
}
