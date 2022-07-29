import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subarray_division_2 {
    
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        int sum = 0;
        if(s.size() == 1){
            return 1;
        }
        for(int i = 0; i < s.size()-m; i++){
            
            for(int j = 0; j < m; j++){
                sum += s.get(i+j);
            }
            System.out.println(sum);
            if (sum == d){
                count++;
            }
            sum = 0;
        }
        return count;
        }
    public static void main(String[] args){
        List<Integer> s = new ArrayList<Integer>();
        Collections.addAll(s, 2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1);
        int d = 18;
        int m = 7;
        System.out.println(birthday(s, d, m));
    }
    
}
