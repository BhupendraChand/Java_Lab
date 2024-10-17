import java.io.*;

class Student implements Serializable
{
    int roll;
        String name;
        String address;
        String number;
    public Student(int r,String n, String a, String nu)
    {
        roll=r;
        name=n;
        address=a;
        number=nu;
    }


}

public class Program3 {
    public static void main(String [] args) throws Exception
    {
        Student std [] = new Student[]
                        {
                            new Student(1, "Alen Pariyar", "Lamjung", "9816699413"),
                            new Student(2, "Nirpesh Puri", "Kritipur", "9816699444"),
                            new Student(3, "Ram Puri", "Tanahun", "9816697444")
                        };
        
        FileOutputStream fo = new FileOutputStream("Students.txt");
        ObjectOutputStream ou = new ObjectOutputStream(fo);
        ou.writeObject(std);
        fo.close();
        ou.close();

        Student stdIn[] = new Student[3];
        FileInputStream fi = new FileInputStream("Students.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);
        stdIn = (Student[])oi.readObject();
        for(int i=0;i<stdIn.length;i++)
        {
            if(stdIn[i].address.equals("Kritipur"))
            {
                System.out.println("Student "+i+" : ");
                System.out.println("Name : "+stdIn[i].name);
                System.out.println("Roll : "+stdIn[i].roll);
                System.out.println("Address : "+stdIn[i].address);
                System.out.println("Phone : "+stdIn[i].number);
            }
            
        }
        
        
    }
}
