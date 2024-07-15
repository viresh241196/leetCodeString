package LeetCodeString;

public class Reverse_Words_in_a_String_III {

    public static void main(String[] args) {
//Input: s = "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        var array = s.split(" ");
        var result = new StringBuilder();
        for (String str: array){
            var reverse = new StringBuilder(str).reverse();
            result.append(reverse);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
