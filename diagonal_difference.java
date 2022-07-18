import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class diagonal_difference{
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int x = 0;
        int y = 0;
        int z = 0;
        
        x = arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
        y = arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);
        if(x > y){
            z = x - y;
        } else {
            z = y - x;
        }
        return z;
        }
    public static void main(String[] args){
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> element_arr_0 = new ArrayList<>();
        element_arr_0.add(11);
        element_arr_0.add(2);
        element_arr_0.add(4);
        arr.add(element_arr_0);
        List<Integer> element_arr_1 = new ArrayList<>();
        element_arr_1.clear();
        element_arr_1.add(4);
        element_arr_1.add(5);
        element_arr_1.add(6);
        arr.add(element_arr_1);
        List<Integer> element_arr_2 = new ArrayList<>();
        element_arr_2.add(10);
        element_arr_2.add(8);
        element_arr_2.add(-12);
        arr.add(element_arr_2);

        System.out.println(diagonalDifference(arr));

    } 
}