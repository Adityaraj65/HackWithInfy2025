import java.util.*;
public class DIstringmatch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        int low=0;
        int high=s.length();
        int[] ans=new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                ans[i]=low++;
            }else{
                ans[i]=high--;
            }

        }
        ans[s.length()]=low;
        System.out.println(ans);
    }
}
