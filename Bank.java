import java.util.*;
public class Bank {
    static int balance;
    public static void deposit(int amount){
        balance+=amount;
        System.out.println(balance);
    }
    public static void withdraw(int amount){
        balance-=amount;
        System.out.println(balance);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a;
        int amount=0;
        do{
            System.out.println("1.To Deposit Enter 1\n2.To Withdraw Enter 2\n3.to Exit enter 0");
            a=sc.nextInt();
            switch (a) {
                case 1:
                System.out.println("hello");
                 amount=sc.nextInt();
                    deposit(amount);
                    break;
                case 2:
                amount=sc.nextInt();
                    withdraw(amount);
                    break;
                    
            }
            if(a==0){
                break;
            }
        }while(a!=0);
    }
}
