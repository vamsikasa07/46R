public class st {
    public static void main(String[] args) {
        String s="aa";
        String a="";
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                        count++;
                }
                
            }
            if(count==0){
                a+=s.charAt(i);
            }
        }
        System.out.println(a);
    }
}
