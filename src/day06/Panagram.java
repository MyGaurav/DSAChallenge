package src.day06;

import java.util.HashSet;

public class Panagram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean result = checkIfPangram(sentence);
        System.out.println(result);
    }
    public static boolean checkIfPangram(String sentence) {
            boolean[] arr = new boolean[26];
            for(int i=0;i<sentence.length();i++){
                arr[sentence.charAt(i) - 'a'] = true;
            }
            for(boolean res:arr){
                if(!res){
                    return false;
                }
            }
            return true;
    }
}

