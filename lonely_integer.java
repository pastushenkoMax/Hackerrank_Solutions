import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class lonely_integer {
    
    public static int lonelyinteger(List<Integer> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++){            
            int count = 0;
            for(int j = 0; j < a.size(); j++){
                if(a.get(i) == a.get(j)){
                    count++;
                }
            }
            if(count == 1){
                x = a.get(i);
            }
        }
        return x;
    }
        
    public static void main(String[] args){
        List<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        System.out.println(lonelyinteger(a));
    }
}
