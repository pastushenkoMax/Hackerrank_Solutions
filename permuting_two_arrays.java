import java.util.ArrayList;
import java.util.List;

public class permuting_two_arrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        int count = 0;
        int min_value =0;
        int max_value = 0;
        List<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++){
            min_value = A.get(i);
            max_value = B.get(i);
            for(int j = i + 1; j < A.size(); j++){
                if(min_value > A.get(j)){
                    min_value = A.get(j);
                    A.set(j, A.get(i));
                    A.set(i, min_value);
                }
                if (max_value < B.get(j)){
                    max_value = B.get(j);
                    B.set(j, B.get(i));
                    B.set(i, max_value);
                }
            }
            C.add(min_value + max_value);
        }
        for(int i = 0; i < C.size(); i++){
            if(C.get(i) >= k){
                count++;
            }
        }
        if(count == C.size()){
            return "YES";
        } else {
            return "NO";
        }
    }
    
    public static void main(String[] args){
        List<Integer> A = new ArrayList<Integer>();
        A.add(2);
        A.add(1);
        A.add(3);
        List<Integer> B = new ArrayList<Integer>();
        B.add(7);
        B.add(8);
        B.add(9);
        int k = 10;
        System.out.println(twoArrays(k, A, B));
    }
}
