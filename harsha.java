import java.util.*;
public class harsha {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int x[]:a){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("before");
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;
        }
        }
        for(int i=0,j=a.length-1;i<(a.length)/2;i++,j--){
            for(int k=0;k<a.length;k++){
                int temp=a[k][i];
                a[k][i]=a[k][j];
                a[k][j]=temp;
            }
        }
        for(int x[]:a){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
