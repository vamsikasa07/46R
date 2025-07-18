import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class main implements Serializable{
    transient int i=10;
    int j=11;
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        main m=new main();
        main m1=new main();
        m1.i=100;
        m1.j=110;
        FileOutputStream fos=new FileOutputStream("abcd.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(m);
        oos.writeObject(m1);

        FileInputStream fis=new FileInputStream("abcd.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        main m2=(main)ois.readObject(); 
        main m3=(main)ois.readObject();
        System.out.println(m2.i+"   "+m2.j);
        System.out.println(m3.i+"   "+m3.j);


        
    }
}