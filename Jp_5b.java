class A{
    void head()
    {
        System.out.println("Heading");
    }
}
class B extends A{
    void body()
    {
        System.out.println("Body");
    }
}
class C extends B{
    void foot()
    {
        System.out.println("foot");
    }
}
public class Jp_5b{
    public static void main(String[] args) {
        C ob = new C();
        ob.head();
        ob.body();
        ob.foot();
    }
}
