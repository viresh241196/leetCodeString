package LeetCodeString;

public class Check_if_the_Sentence_Is_Pangram {


    public static void main(String[] args) {

        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog")) ;
    }

    public static boolean checkIfPangram(String sentence) {
        var str = "abcdefghijklmnopqrstuvwxyz";
        var sb = new StringBuilder();
        for(char x : sentence.toCharArray()){
            if(sb.indexOf(Character.toString(x)) == -1){
                sb.append(Character.toString(x));
            }
        }
        return str.length() == sb.toString().length();
    }
}
