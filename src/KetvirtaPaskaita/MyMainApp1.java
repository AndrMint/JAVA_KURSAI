package KetvirtaPaskaita;


import java.util.*;

public class MyMainApp1 {
    public static void main(String[] args){

        listExample();
        setExample();
        mapExample();
    }

    public static void mapExample(){

        Map<Integer, String> maps = new HashMap<>();
        maps.put(1, "Lukas");
        maps.put(2, "Goda");
        maps.put(3, "Dova");
        maps.put(4, "Andrius");
        maps.put(5, "Keleris");
        maps.put(2, "Goda2");

        for(Map.Entry<Integer, String> map : maps.entrySet()){

            System.out.println("key >" + map.getKey() + "val ->" + map.getValue());
        }

        for (Integer map : maps.keySet()){
            System.out.println("key ->" + map + "val ->" + maps.get(map));
        }

    }

    private static void listExample(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Petras");
        arrayList.add("Arntanas");
        arrayList.add("Tomas");
        arrayList.add("Gruda");
        arrayList.add("Ukas");

        Collections.sort(arrayList);

        for (String name : arrayList){
            System.out.println(name);
        }

        System.out.println(arrayList.size());
    }

    private static void setExample(){

        System.out.println("SET EXAMPLE");
        Set<Integer> setExample = new TreeSet<>();
        setExample.add(3);
        setExample.add(34);
        setExample.add(5);
        setExample.add(41);
        setExample.add(34);

        for(Integer val : setExample){
            System.out.println(val);
        }
        System.out.println("SET WITH OWN OBJECT");

        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat("Koska", 8, "Rusu melynoji"));
        cats.add(new Cat("Gutas", 3, "Persas"));
        cats.add(new Cat("Taa", 3, "NEZINAU"));
        cats.add(new Cat("Ree", 9, "Britu melynasis"));
        cats.add(new Cat("Fre", 3, "Rusu melynoji"));

        for(Cat cat : cats){
            System.out.println(cat);
        }
    }
}
