package LeetCodeString;

import java.util.HashMap;

public class Sorting_the_Sentence {


    public static void main(String[] args) {

        //Input: s = "is2 sentence4 This1 a3"
        //Output: "This is a sentence"
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        var array = s.split(" ");
        var map = new HashMap<Integer,String>();
        for (String str : array){
            map.put(Character.getNumericValue(str.charAt(str.length()-1)),str.substring(0,str.length()-1));
        }
        var sb = new StringBuilder();
        for(int i=1 ;i<=array.length;i++){
            sb.append(map.get(i));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
