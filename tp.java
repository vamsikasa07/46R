class Mythread extends Thread {
    
    synchronized public void run() {
        // System.out.println(Thread.currentThread().getPriority());
        for(int i=1;i<=10;i++){
            // try {   if(i==6)
            //         tp.t2.join();  // wait for Mythread1 to finish
            //     } catch (InterruptedException e) {
            //         e.printStackTrace();
            //     }
            if(i==5){
               tp.t1.yield();
            }
            System.out.println("Thread class1");
        }
        // System.out.println(Thread.currentThread().getName());
        

     }
    
}
class Mythread1  extends Thread {
    
    synchronized public void run(){
        // System.out.println(Thread.currentThread().getPriority());
        for(int i=0;i<=10;i++){
            System.out.println("Thread class");
        }
        //System.out.println(Thread.currentThread().getName());
        

     }    
}
public class tp{
   public static Mythread t1=new Mythread();
   public static Mythread1 t2=new Mythread1();
    public static void main(String[] args) {
        
        
        // t1.setPriority(7);
        t2.setPriority(7);
         t1.start();
         
         t2.start();
        // System.out.println(t1.getPriority()+" "+t3.getPriority());
        // for(int i=0;i<=10;i++){
        //     System.out.println("Main class");
        // }
        
    }
}