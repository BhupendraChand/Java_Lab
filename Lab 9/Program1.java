import java.io.*;

public class Program1 {
    public static void main(String [] args) throws Exception
    {
        String msgOut = "Java is Object oriented programming";
        byte [] printMsg = msgOut.getBytes();

        FileOutputStream fo = new FileOutputStream("fileOut.txt");
        fo.write(printMsg);
        fo.close();
        System.out.println("File written successfully!");

        StringBuffer readMsg = new StringBuffer();
        FileInputStream fi = new FileInputStream("fileOut.txt");
        int i;
        int countVowel = 0;
        while( (i=fi.read()) != -1)
        {
            char ch = (char)i;
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            {
                countVowel++;
            }
            readMsg.append(String.valueOf(ch));
            
        }
        System.out.println("String read successful ! ");
        System.out.println("String : "+readMsg);
        System.out.println("Numbers of vowels : "+countVowel);
    }
}
