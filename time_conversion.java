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


public class time_conversion {
    public static String Results(String s){
        String temp_s ="";
        String new_s ="";
        if(s.contains("PM")){;
            for(int i = 0; i < s.length()-8; i++){
                temp_s += s.charAt(i);
            }
            int x =Integer.parseInt(temp_s); 
            if (x == 12){
                new_s = "12";
            } else {
                x += 12;
                new_s =String.valueOf(x);
            }
            for(int i = 2; i < s.length()-2; i++){
                new_s += s.charAt(i);
            }
            return new_s;
        }
        else{
            for(int i = 0; i < s.length()-8; i++){
                temp_s += s.charAt(i);
            }
            if (temp_s.contains("12")){
                new_s = "00";
                for(int i = 2; i < s.length()-2; i++){
                    new_s += s.charAt(i);
                }
            } else {
                for(int i = 0; i < s.length()-2; i++){
                    new_s += s.charAt(i);
                }
            }
            return new_s;
        }
    }
    public static void main(String[] args){

        System.out.println(Results("02:34:41PM"));
    }
}
