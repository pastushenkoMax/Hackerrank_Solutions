import java.lang.reflect.Array;
import java.util.*;

public class Test {
    /**
     * @param args
     */
    public static void main(String[] args){
        List<Integer> arr = new LinkedList<Integer> ();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        int j = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i = 0; i < arr.size();i++){
            if(arr.get(i) > 0){
                positive++;
            } else if(arr.get(i) < 0){
                negative++;
            } else {
                zero ++;
            }
        }
        float x = (float)positive/j;
        float y = (float)negative/j;
        float z = (float)zero/j;
        System.out.println(String.format("%.6f", x));
        System.out.println(String.format("%.6f", y));
        System.out.println(String.format("%.6f", z));
    }
}