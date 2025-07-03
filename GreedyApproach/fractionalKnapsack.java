import java.util.*;
public class fractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=50;
        int val[]={60,100,120};
        int weight[]={10,20,30};
        double [][] ratio =new double[val.length][2];
        for(int i =0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=w;
        int finalval=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalval+=val[idx];
                capacity-=weight[idx];
            }else{
                finalval+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println(finalval);
        sc.close();
    }
    
}
