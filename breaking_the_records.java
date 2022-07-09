import java.util.LinkedList;
import java.util.List;

public class breaking_the_records {
    
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> record = new LinkedList<Integer>();
        int count_min = 0;
        int count_max = 0;
        int min = scores.get(0);
        int max = scores.get(0);
        for (int i = 0; i < scores.size(); i++){
            if(scores.get(i) > max){
                max = scores.get(i);
                count_max++;
            } else if(scores.get(i) < min){
                min = scores.get(i);
                count_min++;
            } else{
                continue;
            }
        }
        record.add(count_max);
        record.add(count_min);
        return record;
    }
    
    public static void main(String[] args){
        List<Integer> sc = new LinkedList<Integer>();
        sc.add(10);
        sc.add(5);
        sc.add(20);
        sc.add(20);
        sc.add(4);
        sc.add(5);
        sc.add(2);
        sc.add(25);
        sc.add(1);
        System.out.println(breakingRecords(sc));
    }
}
