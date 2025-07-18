public class oned {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int n=arr.length;
        int res[]=new int[n];
        res[n-2]=arr[1];
        res[n-1]=arr[0];
        for(int i=0;i<=n-3;i++){
            res[i]=arr[i+2];

            
        }
        for(int i=0;i<=n-1;i++){
            System.out.print(res[i]+" ");
        }

    }
    
}
