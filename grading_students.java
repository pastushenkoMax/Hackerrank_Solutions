import java.util.LinkedList;
import java.util.List;

public class grading_students {
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
        int next_multiple = 0;
        List<Integer> new_grades = new LinkedList<Integer>();
        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i) < 38){
                new_grades.add(grades.get(i));
            } else {
                next_multiple = grades.get(i) + (5 - grades.get(i) % 5);
                if((next_multiple - grades.get(i)) < 3){
                    new_grades.add(next_multiple);
                } else {
                    new_grades.add(grades.get(i));
                }
            }
        }
        return new_grades;
        }
    public static void main(String[] args){
        List<Integer> grades = new LinkedList<Integer>();
        grades.add(84);
        grades.add(29);
        grades.add(57);
        System.out.println(gradingStudents(grades));
    }
}
