import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class mini_max_sum {
    public static void main(String[] args){
        List<Integer> arr = new LinkedList<Integer>();
        arr.add(7);  
        arr.add(69);
        arr.add(2);
        arr.add(221);
        arr.add(8974);
        System.out.println(arr);
        List<Long> temp_arr = new LinkedList<Long>();
        long sum_arr = 0;
        long sum = 0;
        long min_sum = 0;
        long max_sum = 0;
        for (int i = 0; i < arr.size(); i++){
            sum_arr += arr.get(i);
        }
        System.out.println(sum_arr);
        for (int i = 0; i < arr.size(); i++){
            sum = sum_arr - arr.get(i);
            temp_arr.add(sum);
        }
        System.out.println(temp_arr);
        for (int i = 0; i < temp_arr.size(); i++){
            
            if(temp_arr.get(i) > max_sum){
                max_sum = temp_arr.get(i);
            }
        }
        min_sum = temp_arr.get(0);
        for (int i = 0; i < temp_arr.size(); i++){
            if(temp_arr.get(i) < min_sum){
                min_sum = temp_arr.get(i);
            }
        }
        System.out.printf("%s %s", min_sum, max_sum);
    }
}