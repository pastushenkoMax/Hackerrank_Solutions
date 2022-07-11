import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class camel_case {
    public static String solution (String s) {
        String temp = "";
        if(s.charAt(0) == 'S'){
            if(s.contains("(") || s.contains(")")){
                s = s.replace("(", "");
                s = s.replace(")", "");
            }
            if(s.charAt(2) == 'C'){
                if(Character.isUpperCase(s.charAt(4))){
                    temp += Character.toLowerCase(s.charAt(4));
                }
                for(int i = 5; i < s.length(); i++){
                    if(Character.isUpperCase(s.charAt(i))){
                        temp += " ";
                        temp += Character.toLowerCase(s.charAt(i));
                        continue;
                    }
                    temp += s.charAt(i);
                }
            } else{
                for(int i = 4; i < s.length(); i++){
                    if(Character.isUpperCase(s.charAt(i)) && i > 4){
                        temp += " ";
                        temp += Character.toLowerCase(s.charAt(i));
                        continue;
                    }
                    temp += s.charAt(i);
                }
            }
            

        } else if (s.charAt(0) == 'C'){
            if(s.charAt(2) == 'C'){
                if(Character.isLowerCase(s.charAt(4))){
                    temp += Character.toUpperCase(s.charAt(4));
                }
                for(int i = 5; i < s.length(); i++){
                    temp += s.charAt(i);
                    if (s.charAt(i) == ' '){
                        temp += Character.toUpperCase(s.charAt(i+1));
                        i++;
                    } 
                }
            } else if(s.charAt(2) == 'M'){
                String brackets = "()";
                for(int i = 4; i < s.length(); i++){
                    temp += s.charAt(i);
                    if (s.charAt(i) == ' '){
                        temp += Character.toUpperCase(s.charAt(i+1));
                        i++;
                    } 
                }
                temp += brackets;
            } else {
                for(int i = 4; i < s.length(); i++){
                    temp += s.charAt(i);
                    if (s.charAt(i) == ' '){
                        temp += Character.toUpperCase(s.charAt(i+1));
                        i++;
                    } 
                }
            }
            temp = temp.replace(" ", "");
        }
        return temp; 
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            System.out.println(solution(s));
        }
        scanner.close();
    }
}
// Sample Input
// S;M;plasticCup()
// C;V;mobile phone
// C;C;coffee machine
// S;C;LargeSoftwareBook
// C;M;white sheet of paper
// S;V;pictureFrame

// Sample Output
// plastic cup
// mobilePhone
// CoffeeMachine
// large software book
// whiteSheetOfPaper()
// picture frame