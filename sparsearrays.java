import java.util.LinkedList;
import java.util.List;

public class sparsearrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new LinkedList<Integer>();
        int counter = 0;
        for (int i = 0; i < queries.size(); i++){
            counter = 0;
            for(int j = 0; j < strings.size(); j++){
                if(strings.get(j).equals(queries.get(i))){
                    counter++;
                }
            }
            result.add(counter);
        }
        return result;
    
        }

        public static void main(String[] args){
            List<String> strings = new LinkedList<String>();
            strings.add("4");  
            strings.add("aba");
            strings.add("baba");
            strings.add("aba");
            strings.add("xzxb");
            strings.add("3");  
            strings.add("aba");  
            strings.add("xzxb");
            strings.add("ab");
            List<String> queries = new LinkedList<String>();
            queries.add("xzxb");
            queries.add("ab");  
            queries.add("5");
            System.out.println(matchingStrings(strings, queries));
        }
    
}
