package pirmaPaskaita;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Svecias on 6/6/2017.
 */
public class MainApp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        do {

            System.out.println("Iveskite skaiciu: ");
            number = getNumber(sc);
            sum += number;
        } while (number != 0);
        System.out.println();

    }


    private static int getNumber(Scanner sc) {
        int number = 0;
        while (true) {
            try {
                number = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Blogas skaicius, pakartok");
                sc.nextLine();
            }
        }
        return number;
    }
}

