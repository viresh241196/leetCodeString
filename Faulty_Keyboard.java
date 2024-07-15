package LeetCodeString;

public class Faulty_Keyboard {

    public static void main(String[] args) {
        String s = "string";
        System.out.println(finalString(s));
    }

    public static String finalString(String s) {
        var sb = new StringBuilder();
        var array = s.toCharArray();
        for(char c : array){
            if(c == 'i'){
                sb = sb.reverse();
            }else {
                sb = sb.append(c);
            }
        }
        return sb.toString();
    }
}
