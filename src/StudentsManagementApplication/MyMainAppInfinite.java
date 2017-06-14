package StudentsManagementApplication;

import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by Svecias on 6/14/2017.
 */
public class MyMainAppInfinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numb = 0;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append("|________________________________|\n")
                    .append("|1. IVESTI VARTOTOJA              |\n")
                    .append("|0. PROGRAMOS PABAIGA             |\n")
                    .append("|_________________________________|\n");
            System.out.println(sb.toString());
            System.out.println("IVESKITE SAVO PASIRINKIMA");
            numb = NumberUtils.getCorrectNumber(sc);


            switch (numb) {
                case 1:
                    CreateNewStudent createNewStudent = new CreateNewStudent(sc);
                    createNewStudent.createNewStudent();
                    break;
                case 0:
                    System.out.println("PROGRAMA BAIGIA DARBA");
                    break;
                default:
                    System.out.println("TOKIO PUNKTO NERA");
                    break;
            }
        } while (numb != 0);
    }
}
