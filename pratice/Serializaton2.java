import java.util.*;
import java.io.*;
public class Serializaton2 {
    public static void main(String[] args) throws Exception {
        File dir =new File("pw");
        System.out.println(dir.exists());
        File file =new File(dir,"3.txt");
        System.out.println(file.exists());
        file.createNewFile();
        FileReader fr =new FileReader(file);
        BufferedReader br =new BufferedReader(fr);
        String str =br.readLine();
        while(str!=null)
        {
            System.out.println(str);
            str=br.readLine();
        }
        br.close();

    }
}
