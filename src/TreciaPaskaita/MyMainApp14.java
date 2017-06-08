package TreciaPaskaita;
import java.util.Scanner;


public class MyMainApp14 {
    public static void main(String[] args){
        System.out.println("Iveskite zodi ar sakini");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Iveskit raide, pagal kuria skaiciuosim");
        char letter = (char)sc.nextLine().charAt(0);

        countLetters(word, letter);

    }
    private static void countLetters(String word, char letter){
        int count = 0;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter){
                count++;
            }
        }
        System.out.println(" radom " + count + letter + " raidziu");
    }
}
