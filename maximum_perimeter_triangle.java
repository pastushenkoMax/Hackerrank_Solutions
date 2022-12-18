import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class maximum_perimeter_triangle {
    // public static int getIntFromArray(List<Integer> arr) {
    //     int respond
    //     for(int i = 0; i < arr.size(); i++){

    //     }
    // }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        List<Integer> temp = new LinkedList<Integer>();
        
        
        sticks.sort(null);
        IntStream.range(0, sticks.size()-2).forEach(i -> {
            int a = sticks.get(i);
            int b = sticks.get(i+1);
            int c = sticks.get(i+2);
            if ((a+b>c) && (a+c>b) && (b+c>a)){
                temp.add(a+b+c);
            }});

            if( temp.isEmpty()){
                temp.add(-1);
                return temp;
            } else {
                int x = temp.stream().max(Integer::compareTo).get();
                IntStream.range(0, sticks.size()-2).forEach(i -> {
                    int a = sticks.get(i);
                    int b = sticks.get(i+1);
                    int c = sticks.get(i+2);
                    if ((a+b>c) && (a+c>b) && (b+c>a) && (a+b+c == x)){
                        temp.clear();
                        temp.add(a);
                        temp.add(b);
                        temp.add(c);
                    }});
            }
        // for(int i = 0; i < sticks.size()-2; i++){
        //         a = sticks.get(i);
        //         b = sticks.get(i+1);
        //         c = sticks.get(i+2);
        //         if ((a+b>c) && (a+c>b) && (b+c>a)){
        //             temp.add(a+b+c);
        //         }
        //     }
        // if( temp.isEmpty()){
        //     temp.add(-1);
        //     return temp;
        // } else {
        //     int x = temp.stream().max(Integer::compareTo).get();
        //     for(int i = 0; i < sticks.size()-2; i++){
        //         a = sticks.get(i);
        //         b = sticks.get(i+1);
        //         c = sticks.get(i+2);
        //         if ((a+b>c) && (a+c>b) && (b+c>a) && (a+b+c == x)){
        //             temp.clear();
        //             temp.add(a);
        //             temp.add(b);
        //             temp.add(c);
        //         }
        //     }
        // }

        return temp;

        
    }
    
    
    public static void main(String[] args){
        List<Integer> sc = new LinkedList<Integer>(); 
        sc.add(9);
        sc.add(2015);
        sc.add(5294);
        sc.add(58768);

        sc.add(285);
        sc.add(477);
        sc.add(72);
        sc.add(13867);

        sc.add(97);
        sc.add(22445);
        sc.add(48);
        sc.add(36318);

        sc.add(764);
        sc.add(8573);
        sc.add(183);
        sc.add(3270);

        sc.add(81);
        sc.add(1251);
        sc.add(59);
        sc.add(95094);

        System.out.println(maximumPerimeterTriangle(sc));
    }
}