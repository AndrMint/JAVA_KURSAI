package TreciaPaskaita;


import java.io.*;

public class MyMainBonusApp {
    public static void main(String[] args){

for (people people : readPersonFile()){
    System.out.println(people);
}

    }

    private static people[] readPersonFile(){
        people[] peoples = new people[4];


        try{
        BufferedReader bf = new BufferedReader(new FileReader(new File("zmones.txt")));
        String line = "";
        int i = 0;
        while ((line = bf.readLine()) != null){
            String[] items = line.split(" ");
            if (items.length == 4){
                [i++] = new people(items[0], items [1], items[2], Integer.valueOf(items[3]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return peoples;
    }
}
