package AntraPaskaita;
import java.util.Scanner;

public class MyMainApp7 {
    public static void main(String[] args){
        int[][] matrix = {{12, 2, 4}, {99, -1, -2}, {25, -3, 3}};
        int count = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > 0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
