import java.util.LinkedList;
import java.util.List;

public class divisible_sum_pairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        int x = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(ar.get(i) < ar.get(j)){
                    x = ar.get(i) + ar.get(j);
                    if(x % k == 0){
                        
                        count++;
                    }
                }
            }
        }
        return count;
        }
        public static void main(String[] args){
            List<Integer> ar = new LinkedList<Integer>();
            ar.add(1);
            ar.add(3);
            ar.add(2);
            ar.add(6);
            ar.add(1);
            ar.add(2);

            System.out.println(divisibleSumPairs(6, 3, ar));
            
            
    }
}
