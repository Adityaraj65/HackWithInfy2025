import java.util.*;
public class Activity {

    public static void main(String[] args) {
        int start[]={};
        int end[]={};
        int[][] res=new int[start.length][2];
        for(int i=0;i<start.length;i++){
            res[i][0]=i;
            res[i][1]=start[i];
            res[i][2]=end[i];

        }
        Arrays.sort(res,Comparator.comparingDouble(o->o[2]));
        int maxAct=0;
        ArrayList<Integer>ans = new ArrayList<>();
        maxAct=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend);
            maxAct++;
            ans.add(i);
            lastend=end[i];
        }
        System.out.println("max activities"+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}
