import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class pangrams {
    
    public static String pangrams(String s) {
        // Write your code here
        String temp_s = s.replace(" ", "").toLowerCase();
        List<Character>  all_char = new ArrayList<Character>();
        for(int i = 0; i < temp_s.length(); i++){
            all_char.add(temp_s.charAt(i));
        }
        List<Character> alphabet 
            = all_char.stream().distinct().collect(
            Collectors.toList());
        if(alphabet.size() == 26){
            return "pangram";
        } else{
            return "not pangram";
        }
    }

    public static void main(String[] args){
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }
}
