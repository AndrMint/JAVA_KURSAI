package AntraPaskaita;
import utils.NumberUtils;
import java.util.Scanner;


public class MyMainApp10 {
    public static void main(String[] args){
        System.out.println("Iveskite skaiciu n");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(true){
        number = NumberUtils.getCorrectNumber(scanner);
        if(number > 0){
            break;
        }
        }

        for (int i = 0; i <= number; i++ ){

        }
    }
}
