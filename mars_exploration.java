public class mars_exploration {
    public static int marsExploration(String s) {
        // Write your code here
        int answer = 0;    
        for(int i = 0; i < s.length(); i+=3){
            if(s.charAt(i) != 'S'){
                answer++;
            }
            if (s.charAt(i+1) != 'O'){
                answer++;
            }
            if (s.charAt(i+2) != 'S'){
                answer++;
            }
        }    
        return answer;
        }
    public static void main(String[] args){
        String s = "SOSOSOSOSDSDSKWOSDOSDOASDOASDFAFJDFDOSOSOWNSOSOSNDSKDDOSOSOSJDSDSOOSOSDSDOSASSOASDSAOSOSODSDSOASDWS";
        System.out.println(marsExploration(s));
    }
}
