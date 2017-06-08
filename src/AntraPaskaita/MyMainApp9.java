package AntraPaskaita;
import utils.NumberUtils;

import java.util.Scanner;


public class MyMainApp9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        kartojimas(scanner);

    }


    public static void kartojimas(Scanner scanner){
        while (true) {
            skaiciuotuvas(scanner);
            System.out.println("Ar norite pakartoti funkcijas?");
            System.out.println("1 - taip " +
                    "0 - ne");
            int number = NumberUtils.getCorrectNumber(scanner);
            if(number == 0){
                break;
            }
        }

    }

    private static void skaiciuotuvas(Scanner scanner){
        System.out.println("Iveskite du skaicius");

        System.out.println("Iveskite pirma skaiciu: ");
        int pirmasSkaicius = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Iveskite antra skaiciu: ");
        int antrasSkaicius = NumberUtils.getCorrectNumber(scanner);
        System.out.println("Pasirinkite funkcijas: " + "1 - suma " +
                "2 - skirtumas "
                + "3 - sandauga ");
        int FunkcijuPasirinkimas = NumberUtils.getCorrectNumber(scanner);
        if(FunkcijuPasirinkimas == 1 ){
            System.out.println(pirmasSkaicius + antrasSkaicius);
        }
        else if (FunkcijuPasirinkimas == 2){
            System.out.println(pirmasSkaicius - antrasSkaicius);
        }
        else if (FunkcijuPasirinkimas == 3){
            System.out.println(pirmasSkaicius * antrasSkaicius);
        }
    }
}
