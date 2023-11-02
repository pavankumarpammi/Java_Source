import java.util.*;
import java.io.*;
class Sol{
    public static void main(String[] args) throws Exception {
        File dir =new File("test");
        dir.mkdir();
        File file =new File(dir,"3.txt");
        file.createNewFile();
        System.out.println(file.exists());
        FileWriter fw =new FileWriter(file,true);
        BufferedWriter bw =new BufferedWriter(fw);
        bw.write("hello World!1");
        bw.newLine();
        bw.write("Programming in java....");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        bw.write("********");
        bw.close();
        FileReader fr=new FileReader(file);
        BufferedReader br =new BufferedReader(fr);
        String str =br.readLine();
        while (str!=null){
            System.out.println(str);
            str=br.readLine();
        }
        br.close();

    }
}