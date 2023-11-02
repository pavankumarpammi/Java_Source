import java.io.*;
class Cricketer1 implements Serializable{
    String name;
   int rollno;
    transient  int age;
    public Cricketer1(String name,int age,int rollno)
    {
        this.name=name;
        this.age=age;
        this.rollno=rollno;

    }
    public String toString()
    {
        return name+" "+age+" "+rollno;
    }
    public void disp()
    {
        System.out.println(name+" : "+age+" : "+rollno);
    }
}
class SerializationEx {
    public static void main(String[] args) throws Exception {
       FileInputStream fis =new FileInputStream("sample.txt");
       ObjectInputStream ois =new ObjectInputStream(fis);
       System.out.println(ois.readObject());
      Cricketer1 cr=(Cricketer1)ois.readObject();
      cr.disp();
     // ois.flush();
      ois.close();

    }
}

