public class pp {
    
    public static void main(String[] args) {
        int c=0;
        for(int i=2;i<=100;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                c++;
                System.out.println(i);
            }
        }
        System.out.println(c);
    }
}
    