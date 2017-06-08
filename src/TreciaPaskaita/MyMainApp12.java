package TreciaPaskaita;

import java.util.Arrays;

public class MyMainApp12 {
    public static void main(String[] args) {
        int[] mas = {12, 4, 65, 7, 12, 56, 3};
        System.out.println(getMaxNumber(mas));
        System.out.println(getMaxNumb2(mas));
        System.out.println(getMinNumber(mas));

    }

    private static int getMaxNumber(int[] mas) {
        int temp = 0;


        for (Integer numb : mas) {
            if (numb > temp) {
                temp = numb;
            }
        }
        return 0;
    }

    private static int getMaxNumb2(int[] mas){
        Arrays.sort(mas);
        return mas[mas.length - 1];
    }

    private static int getMinNumber(int[] mas){
        Arrays.sort(mas);
        return mas[0];
    }

}
