package TreciaPaskaita;

import com.sun.javafx.scene.web.Debugger;

import java.io.*;

public class MyMainApp17 {
    public static void main(String[] args){
        try {
            File file = new File("Vardai.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            String line = "";
            while ((line = bf.readLine()) !=null) {
                if (line.startsWith("A")){
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Nepavyko rasti failo");
        }
    }
}
//metodas ife line.startwith
