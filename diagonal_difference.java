import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class diagonal_difference{
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if( i == j ){
                    x += arr.get(i).get(j);
                }
            }
                y += arr.get(i).get(arr.size()-(i+1));
        }
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