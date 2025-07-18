public class pragmapractice {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,4,8};
        int max=a[0];
        int max2=a[1];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max2=max;
                max=a[i];
                
            }
        }
        System.out.println(max2);

    }
}
