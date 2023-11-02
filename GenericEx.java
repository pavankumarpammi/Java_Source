import java.util.*;
class Student{
    int marks;
    int age;
    String name;
 public Student(int marks,int age,String name)
  {
    this.marks =marks;
    this.age=age;
    this.name=name;
  }
  public String getName()
  {
    return name;
  }
  public int getMarks()
  {return marks;}
  public int getAge()
  {return age;}
  public String toString()
  { return marks+"-"+age+"-"+name;}

}

public class GenericsWithClass {
    Student st1=new Student(50,18,"raju");
    Student st2=new Student(25,17,"ramu");
    Student st3=new Student(43,19,"rajesh");
    List<Student> lis =new ArrayList<Student>();
    lis.add(st1);
    lis.add(st2);
    lis.add(st3);

    System.out.println(lis);


}
