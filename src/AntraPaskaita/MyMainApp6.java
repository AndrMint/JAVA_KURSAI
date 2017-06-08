package AntraPaskaita;
import utils.NumberUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMainApp6 {
    public static void main(String[] args){
        System.out.println("Iveskite masyvo ilgi");
        Scanner scanner = new Scanner(System.in);
        int masLength = NumberUtils.getCorrectNumber(scanner);

        int[] mas = new int[masLength];
        int index = 1;
        for (int i = 0; i < mas.length; i++){
            System.out.println("Iveskite " + index++ + "skaiciu");
            mas[i] = NumberUtils.getCorrectNumber(scanner);
        }
        printNumbers(mas);
    }


    private static int getCorrectNumber(Scanner scanner){
        int response = 0;
        while (true) {
            try {
                response = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius, pakartokite");
                scanner.nextLine();
            }
        }
        return response;
    }


    private static void printNumbers(int[] mas){
        for (Integer numb : mas){
            if (numb > 100){
                System.out.println(numb);
            }
        }
    }

}
