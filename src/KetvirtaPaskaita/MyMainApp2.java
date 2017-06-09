package KetvirtaPaskaita;


import utils.CollectionsUtils;

import java.util.ArrayList;
import java.util.List;

public class MyMainApp2 {
    public static void main(String[] args){
        List<String> naujas = new ArrayList<>();
        naujas.add("Tomas");
        naujas.add("Gabija");
        naujas.add("Tenhdhdh");
        naujas.add("Arvydas");
        naujas.add("Tumas");

        for (String vardai : naujas){
            if (vardai.length() > 6){
                System.out.println(vardai);
            }

        }

Grazinimas();
    }


    public static void Grazinimas(){
        List<String> grazinimas = new ArrayList<>();
        grazinimas.add("Reeee");
        grazinimas.add("swx");
        grazinimas.add("namo");
        grazinimas.add("kursai");

        String val = CollectionsUtils.getFirstelement(grazinimas);
        System.out.println(val);
    }
}







//sukurti utils, kuris
