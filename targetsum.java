import java.util.*;
public class targetsum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int a[]={1,2,3,4,1,2,3,4};
        int target=2;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    continue;
                }
                if(a[i]+a[j]==target){
                    if(hs.containsKey(a[i])||hs.containsValue(a[j])||hs.containsKey(a[j])||hs.containsValue(a[j])){
                        continue;
                    }
                    else{
                        hs.put(a[i],a[j]);
                    }
                    
                }
            }
        }
        System.out.println(hs);
    }
}
