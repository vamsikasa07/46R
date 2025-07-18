import java.util.*;
public class Sneha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        double avg=(a+b+c+d+e)/5;
        if(a>=35&&b>=35&&c>=35&&d>=35&&e>=35){
            if(avg>= 90){
                System.out.println("Outstanding");
            }
            else{
                if(avg>= 75){
                  System.out.println("Distinction");
                }
                else{
                    if(avg>= 60){
                System.out.println("First");
            }
                }
            }
            
            
        }
        else{
            System.out.println("fail");
        }
    }
}
