package Testas;
import java.util.Scanner;
/**
 * Created by Svecias on 6/12/2017.
 */
public class UzduotisTestuko {
    public static void main(String[] args){
        System.out.println("Irasykite du skaicius:");
        Scanner sc = new Scanner(System.in);
        Skaiciavimai(sc);


    }

    public static void Skaiciavimai(Scanner sc){
        System.out.println("Irasykite pirma skaiciu");
        int numberOne = sc.nextInt();
        System.out.println("Irasykite antra skaiciu:");
        int numberTwo = sc.nextInt();

        if (numberOne != 0){
            System.out.println(numberOne / numberTwo);
        }
    }
}
