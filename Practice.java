class Test{
    public void m1(){
        System.out.println("hello");
    }
}
class Test1 extends Test{
    public void m1(){
        System.out.println("pello");
    }
}
public class Practice {
    public static void main(String[] args) {
       /*  Integer n=Integer.valueOf(10);
        int a=n.intValue();
        double d=Double.parseDouble("10.2");
        //System.out.println(Integer.toOctalString(n));
        String s="Anil";
        s.replace('A', 'a');
        System.out.println(s);
        System.out.println(n.getClass().getName());*/
        Test t=new Test1();
        t.m1();


     
     
    }
}
