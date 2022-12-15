import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class migratory_birds {
    public static int migratoryBirds(List<Integer> arr) {
            int type = 0;
        int[] counter_arr = {0,0,0,0,0};
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 1){
                counter_arr[0]++;
            } else if(arr.get(i) == 2){
                counter_arr[1]++;
            } else if(arr.get(i) == 3){
                counter_arr[2]++;
            } else if(arr.get(i) == 4){
                counter_arr[3]++;
            } else{
                counter_arr[4]++;
            }
        }
        int max = counter_arr[0];
        for (int i = 1; i < counter_arr.length; i++){
            if (counter_arr[i] > max){
                max = counter_arr[i];
                type = i+1;
            }
        }
        return type;
    }
    
    public static void main(String[] args){
        List<Integer> sc = new LinkedList<Integer>();
        sc.add(1);  
        sc.add(2);
        sc.add(3);
        sc.add(4);
        sc.add(5);
        sc.add(4);
        sc.add(3);
        sc.add(2);
        sc.add(1);
        sc.add(3);
        sc.add(4);

        System.out.println(migratoryBirds(sc));
    }
}
