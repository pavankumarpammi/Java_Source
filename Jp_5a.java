 class Parent {
    void surname()
    {
        System.out.print("surname>>>");
    }
}
class Child extends Parent{
    void name()
    {
        System.out.print("<<<Name...");
    }

public static void main(String[] args) {
    Child ob = new Child();
    ob.name();
    ob.surname();
}
}