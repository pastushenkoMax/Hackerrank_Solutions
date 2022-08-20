import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class sales_by_match {

    
    public static int sockMerchant(int n, List<Integer> ar) {
        
        // int count = 0;
        List<Integer> temp = new LinkedList<Integer>();
        // for(int i = 0; i < ar.size(); i++){
        //     if(temp.contains(ar.get(i))){
        //         temp.remove(ar.get(i));
        //         count++;
        //         continue;
        //     }
        //         temp.add(ar.get(i));
        // }
        IntStream.range(0, n)
        .forEach(i -> {if(temp.contains(ar.get(i))){
            temp.remove(ar.get(i));
            }else{temp.add(ar.get(i));
            }});
        int count = (ar.size() - temp.size())/2;
        return count;
    }
    
    public static void main(String[] args){
        List<Integer> sc = new LinkedList<Integer>();
        sc.add(4);  
        sc.add(5);
        sc.add(5);
        sc.add(5);
        sc.add(6);
        sc.add(6);
        sc.add(4);
        sc.add(1);
        sc.add(4);
        sc.add(4);
        sc.add(3);
        sc.add(6);
        sc.add(6);
        sc.add(3);
        sc.add(6);
        sc.add(1);
        sc.add(4);
        sc.add(5);
        sc.add(5);
        sc.add(5);

        System.out.println(sockMerchant(sc.size(), sc));
    }
}
