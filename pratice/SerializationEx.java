import java.io.*;
class Cricketer implements Serializable{
    private String name;
    private int rollno;
    private int age;
    public Cricketer(String name,int age,int rollno)
    {
        this.name=name;
        this.age=age;
        this.rollno=rollno;

    }
    // public String toString()
    // {
    //     return name+" "+age+" "+rollno;
    // }
    public void disp()
    {
        System.out.println(name+" : "+age+" : "+rollno);
    }
}
public class SerializationEx {
    public static void main(String[] args) throws Exception {
        // Cricketer c=new Cricketer("pavan", 20, 54);
        // System.out.println(c);
        // File file =new File("sample.txt");
        // file.createNewFile();
        // System.out.println(file.exists());
        // FileOutputStream fos =new FileOutputStream("sample.txt");
        // BufferedOutputStream bos =new BufferedOutputStream(fos);
        // ObjectOutputStream oos =new ObjectOutputStream(bos);
        // oos.writeObject(c);
        // oos.flush();
        // oos.close();
        FileInputStream fis =new FileInputStream("sample.txt");
        BufferedInputStream bis =new BufferedInputStream(fis);
        ObjectInputStream ois =new ObjectInputStream(bis);
       Cricketer cr =(Cricketer)ois.readObject();
        //System.out.println(ois.readObject());
        cr.disp();
        ois.close();

    }
}
