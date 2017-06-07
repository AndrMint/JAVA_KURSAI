package pirmaPaskaita;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by Svecias on 6/6/2017.
 */
public class MainApp1 {

    public static final String NELYGINIS = "Nelyginis";

    public static void main (String[] args) {
        System.out.println("Iveskite skaiciu:");
        Scanner sc = new Scanner(System.in);
        try {
            int val = sc.nextInt();

Naujas(val);
/*            if (val % 2 == 0) {
                System.out.println("Lyginis");
            } else {
                System.out.println("Nelyginis");
            }*/
        }catch (InputMismatchException e){
            System.out.println("Irasykite skaicius, o ne raides");
        }
    }

    private static void Naujas (int number) {
        String message = NELYGINIS;
        if (number % 2 == 0){
            message = "Lyginis";
        }
        System.out.println(message);

    }

}
