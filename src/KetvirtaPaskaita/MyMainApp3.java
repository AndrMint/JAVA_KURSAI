package KetvirtaPaskaita;


import java.util.*;

public class MyMainApp3 {

    public static void main(String[] args){
        List<Vartotojas> vartotojai = createList();



        Collections.sort(vartotojai, new Comparator<Vartotojas>() {
            @Override
            public int compare(Vartotojas o1, Vartotojas o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Vartotojas p : vartotojai){
            System.out.println(p);
        }
    }

    private static List<Vartotojas> createList(){
        List<Vartotojas> vartotojai = new ArrayList<>();

        vartotojai.add(new Vartotojas("Petras", "Petraitis" , 50 , "Kaunas"));
        vartotojai.add(new Vartotojas("Satou", "Kazuma" , 21 , "Vilnius"));
        vartotojai.add(new Vartotojas("Turgus", "Turgavicius" , 11 , "Kazkur"));
        vartotojai.add(new Vartotojas("Paulius", "Pauliauskas" , 32 , "Klaipeda"));

        return vartotojai;
    }
}
