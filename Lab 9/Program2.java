import java.io.*;
public class Program2 {
    public static void main(String [] args) throws Exception
    {
        FileWriter fw = new FileWriter("File2.txt");
        fw.write("File is written successfully");
        fw.close();
        System.out.println("File written");
        FileReader fr = new FileReader("File2.txt");
        int i;
        while ((i=fr.read()) != -1)
        {
            System.out.print((char)i);
        }

        fr.close();;

    }
}
