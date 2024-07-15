package LeetCodeString;

public class Maximum_Nesting_Depth_of_the_Parentheses {

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    private static int maxDepth(String s) {
        int max = 0;
        int count = 0;
        var array = s.toCharArray();
        for (char x : array) {
            if (x == '(') {
                count++;

            } else if (x == ')') {
                count--;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
