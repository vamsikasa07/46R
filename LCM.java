public class LCM {
    public static void main(String[] args) {
        int kg=11;
        int amount=0;
        int a=30;
        int b=10;
        int temp=0;
        int val=b;
        String s="D";
        for(int i=a;i>0;i--){
            if((a%i==0)&&(b%i==0)){
                System.out.println(i);
                break;
            }
        }
        while(temp==0){
            if((val%a==0)&&(val%b==0)){
                System.out.println(val);
                temp=1;break;
            }
            val++;
        }
        if(s=="D"){
            if(kg>5){
            amount=500;
            amount+=(kg-5)*100;
        }
        else if(kg<5){
            amount=500;
        }
        }
        else{
            if(kg>10){
                amount=2000;
                amount+=(kg-10)*500;
            }
            else if(kg<=10&kg>5){
                 amount=1000;
                amount+=(kg-5)*200;
            }
            else{
                amount=500;
            }
        }
        
        System.out.println(amount);
    }
    
}
