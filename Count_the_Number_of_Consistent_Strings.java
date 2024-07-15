package LeetCodeString;

public class Count_the_Number_of_Consistent_Strings {

    public static void main(String[] args) {
//allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
        var allowed = "abc";
        var words = new String[]{"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        var count = 0;
        for (String word : words){
            var isallowed = true;
            for(char c : word.toCharArray()){
                if(!allowed.contains(Character.toString(c))){
                    isallowed = false;
                    break;
                }
            }
            if(isallowed){
                count++;
            }
        }
        return count;
    }
}
