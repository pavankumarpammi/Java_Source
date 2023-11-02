import java.util.*;
import java.io.*;
class Sol{
    public static void main(String[] args) throws IOException {
        // File sample =new File("pw");
        // sample.mkdir();
        // File file =new File(sample,"1.txt");
        // file.createNewFile();
        // //System.out.println(file.exists());
        // FileWriter fw =new FileWriter(file,true);
        // fw.write("heading!!"+"\n");
        // fw.write("abcde"+"\n");
        // fw.write(65+"\n");
        File dir =new File("pw");
        File file =new File(dir, "1.txt");
        System.out.println(file.exists());
        FileWriter fw =new FileWriter(file,true);
         fw.write("heading!!"+"\n");
        fw.write("abcdefg"+"\n");
        fw.write(52+"\n");
        fw.write(75);
        fw.close();
        FileReader fr=new FileReader(file);
       // int i=fr.read();
        // while(i!=-1)
        // {
        //     System.out.println((char)i);
        //     i=fr.read();
        // }

        //FileReader fr=new FileReader(file);
        BufferedReader br =new BufferedReader(fr);
        String str =br.readLine();
        while(str!=null)
        {
            System.out.println(str);
            str=br.readLine();
        }
    }
}