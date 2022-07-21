import java.util.ArrayList;
import java.util.List;

public class counting_valley {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count = 0;
        List<Character> enter_valley = new ArrayList<>();
        for(int i = 0; i < path.length();i++){
            if(path.charAt(i) == 'U'){
                count++;
            } else {
                count--;
            }
            if (count < 0){
                enter_valley.add('U');
            } else {
                enter_valley.add('D');
            }
        }
        int valley_count = 0;
        for(int i = 0; i < enter_valley.size(); i++){
            if(enter_valley.get(i) == 'U' && enter_valley.get(i+1) == 'D'){
                valley_count++;
            }
        }
        return valley_count;
        }
    

    public static void main(String[] args){
        String path = "DDUUDDUDUUUD";
        int steps = 12;
        System.out.println(countingValleys(steps, path));
}
}
