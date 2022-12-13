import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class migratory_birds {
    public static int migratoryBirds(List<Integer> arr) {
            // arr.forEach(i -> System.out.println(arr.get(i)));
            int type = 0;
        int id_1 = 0;
        int id_2 = 0;
        int id_3 = 0;
        int id_4 = 0;
        int id_5 = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 1){
                id_1++;
            } else if(arr.get(i) == 2){
                id_2++;
            } else if(arr.get(i) == 3){
                id_3++;
            } else if(arr.get(i) == 4){
                id_4++;
            } else{
                id_5++;
            }
        }
        
        if(id_5 > id_4){
            type = 5;
        } else if(id_4 > id_3){
            type = 4;
        } else if(id_3 > id_2){
            type = 3;
        } else if(id_2 > id_1){
            type = 2;
        } else {
            type = 1;
        }
    return type; 
        // int count = 0;
        // List<Integer> temp = new LinkedList<Integer>();
        // IntStream.range(0, n)
        // .forEach(i -> {if(temp.contains(ar.get(i))){
        //     temp.remove(ar.get(i));
        //     }else{temp.add(ar.get(i));
        //     }});
        // int count = (ar.size() - temp.size())/2;
        // return count;
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