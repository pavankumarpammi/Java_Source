import java.lang.Math;
import java.util.Scanner;
abstract class shape{
    abstract void area(int a, int b);
    double area;
}
class Tri extends shape{
    void area(int a, int b)
    {
        area = (b*a)/2;
        System.out.println("Area of triange:"+area);
    }
}
class Rect extends shape{
    void area(int a,int b)
    {
        area = a*b;
        System.out.println("area of rectangle:"+area);
    }
}
class Area{
public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    Tri t =new Tri();
    Rect r = new Rect();
    System.out.println("Enter choose of Triangle(1) or Rectangle(2):");
    int ch ;
    ch = ob.nextInt();
    switch(ch)
    {
        case 1:
         {System.out.println("enter length:");
         int a = ob.nextInt();
         System.out.println("enter breath:");
         int b = ob.nextInt();
         t.area(a, b);}
        case 2:{
         System.out.println("enter length:");
         int a1 = ob.nextInt();
         System.out.println("enter breath:");
         int b1 = ob.nextInt();
         r.area(a1, b1);}


        
    }
}}