public class fibonachi {
    public static int fib(int a){
        if(a<=1){
            return a;
        }
        return fib(a-1)+fib(a-2);
          
    }
    public static void main(String[] args) {
        int n=10;
        // System.out.print(0+" ");
        // System.out.print(1+" ");
        int first=0;
        int sec=1;
        for(int i=0;i<n;i++){
            // System.out.print(first+sec+" ");
            // int temp=first;
            // first=sec;
            // sec=temp+sec;
            System.out.println(fib(i));
        }
    }
}
