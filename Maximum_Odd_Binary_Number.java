package LeetCodeString;

public class Maximum_Odd_Binary_Number {


    public static void main(String[] args) {

        //Input: s = "010"
        //Output: "001"
        System.out.println(maximumOddBinaryNumber("010"));
    }

    public static String maximumOddBinaryNumber(String s) {
        int zero = 0,one = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                zero++;
            }else {
                one++;
            }
        }
        var sb = new StringBuilder();
        while(one-- >1){
            sb.append('1');
        }
        while(zero-- >0){
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }
}
