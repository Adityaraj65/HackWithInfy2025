import java.util.*;

public class leetcode646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainlen = 1;
        int chainend = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainend) {
                chainlen++;
                chainend = pairs[i][1];
            }
        }
        return chainlen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = sc.nextInt(); 
            pairs[i][1] = sc.nextInt(); 
        }

        leetcode646 sol = new leetcode646();
        int result = sol.findLongestChain(pairs);
        System.out.println(result);
    }
}
