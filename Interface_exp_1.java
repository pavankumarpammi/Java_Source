interface A{
    public void show();   
}
class B implements A{
    public void show(){
        System.out.println("Hello");
    }}

class EXP_1_INTERFACE{

public static void main(String[] args) {
    A ob = new B();
    ob.show();
}
}