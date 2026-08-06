public class checkParenthesis{
    public static boolean checkValidString(String s){
        return solve(s, 0, 0);
    }
    
    public static boolean solve(String s, int index, int count){
        if(count < 0){
            return false;
        }
        if(index == s.length()){
            return count == 0;
        }
        
        Character ch = s.charAt(index);
        if(ch == '('){
            return solve(s, index + 1, count + 1);
        }
        
        if(ch == ')'){
            return solve(s, index + 1, count - 1);
        }
        
        return solve(s, index + 1, count + 1) || 
        solve(s, index + 1, count - 1) || 
        solve(s, index + 1, count);
    }
    
    public static void main(String[] args) {

        String s1 = "()";
        String s2 = "(*)";
        String s3 = "(*))";
        String s4 = "(()";
        String s5 = ")*(";

        System.out.println(s1 + " -> " + checkValidString(s1));
        System.out.println(s2 + " -> " + checkValidString(s2));
        System.out.println(s3 + " -> " + checkValidString(s3));
        System.out.println(s4 + " -> " + checkValidString(s4));
        System.out.println(s5 + " -> " + checkValidString(s5));
    }
}