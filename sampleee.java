class studnt{
    int a;
}
public class sampleee {
    public static void main(String[] args) {
        studnt s = new studnt();
        studnt s1= s;
        s1.a=10;
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s1);
        System.out.println(s);
    }
}
