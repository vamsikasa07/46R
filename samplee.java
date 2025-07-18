import java.util.*;
public class samplee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> al= new ArrayList<Integer>();
        int a[]={1,2,3,4,5};
        for(int i=1;i<=num;i++){
            int x=a[a.length-1];
            for(int j=a.length-2;j>=0;j--){
                a[j+1]=a[j];
            }
            a[0]=x;
        }
        System.out.println(Arrays.toString(a));
    }
}
