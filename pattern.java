import java.util.regex.*;;
public class pattern {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("\s");
        Matcher m=p.matcher("abcabababa bab");
        while(m.find()){
            System.out.println(m.start()+" "+m.end());
        }
    }
}
