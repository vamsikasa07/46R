import java.io.File;
import java.io.IOException;

public class file{
    public static void main(String[] args) throws IOException {
        File f=new File("abc");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
        File f1=new File(f,"abc.txt");
        
        f1.createNewFile();
        System.out.println(f.isDirectory());
        f1.length();
        
         File f2=new File("desktop");

        String[] s=f2.list();
        for(String x:s){
            System.out.println(x);
        }
        
        
    }
}