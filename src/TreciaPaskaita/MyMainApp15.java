package TreciaPaskaita;
import java.util.Scanner;

public class MyMainApp15 {
    public static void main(String[] args){
        System.out.println("Parasykite zodi");
        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        char a = "ab".charAt(0);
        char b = "ab".charAt(1);

        if (zodis != null){
            for (int i = 0; i < zodis.length()-1; i++ ){
                if(zodis.charAt(i) == a && zodis.charAt(i + 1) == b){

                    System.out.println("Surasta");
                }
            }
        }
    }
}
