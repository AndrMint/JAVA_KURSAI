package AntraPaskaita;
import utils.NumberUtils;

import java.util.Scanner;

public class MyMainApp8 {
    public static void main(String[] args){
        System.out.println("Iveskite x reiksme");
        Scanner scanner = new Scanner(System.in);
        int naujasSkaicius = NumberUtils.getCorrectNumber(scanner);
        if (naujasSkaicius > 0){
            System.out.println(2 * naujasSkaicius + 8);
        }
        else if (naujasSkaicius < 0){
            System.out.println(21 - 7 * naujasSkaicius);
        }
    }
}
