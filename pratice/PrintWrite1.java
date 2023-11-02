import java.util.*;
import java.io.*;
public class PrintWrite1 {
    public static void main(String[] args) throws Exception{
        File dir =new File("pw");
        File file =new File(dir,"2.txt");
        file.createNewFile();
        FileWriter fw =new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw =new PrintWriter(bw);
        bw.write("Hello");
        bw.write("world!!");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        pw.println(65);
        bw.close();
        
    }
}
