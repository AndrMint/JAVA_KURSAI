package TreciaPaskaita;
import java.util.Scanner;

public class MyMainApp16 {
    public static void main(String[] args){
        String[] word = {"KOL EINU ŠUNIE LOK",
        "ARGI TEN NE TIGRA", "SĖDĖK UŽU KĖDĖS"};

        checkPalindromes(word);
    }

    private static void checkPalindromes(String[] palindromes){
        for(String p : palindromes) {
            checkPalinDrome(p);
        }
    }

    private static void checkPalinDrome(String word){
        String word1 = word.replaceAll(" ", "");
        boolean isPalindrome = true;
        for (int i = 0; i < word1.length(); i++){
            if(word1.charAt(i) != word1.charAt(word1.length() - 1 - i)){
                isPalindrome = false;
            }
        }
        System.out.println(word + "IS palindrome ? ->" + isPalindrome);

    }
}
