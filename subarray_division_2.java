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
        for(int i = 0; i <= s.size()-m; i++){
            
            for(int j = 0; j < m; j++){
                
                sum += s.get(i+j);
            }
            if (sum == d){
                count++;
            }
            sum = 0;
        }
        return count;
        }
    public static void main(String[] args){
        List<Integer> s = new ArrayList<Integer>();
        Collections.addAll(s, 2,3,4,4,2,1,2,5,3,4,4,3,4,1,3,5,4,5,3,1,1,5,4,3,5,3,5,3,4,4,2,4,5,2,3,2,5,3,4,2,4,3,3,4,3,5,2,5,1,3,1,4,2, 2, 4, 3, 3, 3, 3, 4, 1, 1, 4, 3, 1, 5, 2, 5, 1, 3, 5, 4, 3, 3, 1, 5, 3, 3, 3, 4, 5, 2);
        int d = 26;
        int m = 8;
        System.out.println(birthday(s, d, m));
    }
    
}
