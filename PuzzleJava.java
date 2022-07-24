import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class PuzzleJava {
    
    ArrayList<Integer> getTenRolls(){
        Random randMachine = new Random();
        ArrayList<Integer> generatedArray = new ArrayList<Integer>();
        int randomNum;
        for(int i = 0; i < 10; i++){
            randomNum = 1+randMachine.nextInt(20);
            generatedArray.add(randomNum); 
        }
        return generatedArray; 
    }
    Character getRandomLetter(){
        Random randMachine = new Random();
        ArrayList<Character> letterArray = new ArrayList<Character>();
        for(char c = 'a'; c <= 'z'; c++){
            letterArray.add(c);
        }
        int letterNum = randMachine.nextInt(26);
        Character randomLetter = letterArray.get(letterNum);
        return randomLetter;
    }

    String generatePassword(){
        String password = "";
        for(int i = 0; i < 8; i++){

            password += getRandomLetter();
        }
        return password;
    }

    String getNewPasswordSet(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        String password = "";
        for(int i = 0; i < num; i++){

            password += getRandomLetter();
        }
        scan.close();
        return password;
    }

    ArrayList<Integer> shuffleArray(){
        Random randMachine = new Random();
        ArrayList<Integer> arrayBeforeShuffle =  new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			arrayBeforeShuffle.add(i);
		} 
        System.out.println(arrayBeforeShuffle);
        int randomNum;
        int temp;
        for(int i = 0; i < arrayBeforeShuffle.size(); i++){
            randomNum = randMachine.nextInt(arrayBeforeShuffle.size());
			temp = arrayBeforeShuffle.get(randomNum);
			arrayBeforeShuffle.set(randomNum, arrayBeforeShuffle.get(i));
			arrayBeforeShuffle.set(i, temp) ;
        }
        return arrayBeforeShuffle;
    }
}

