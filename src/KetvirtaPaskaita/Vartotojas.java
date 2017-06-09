package KetvirtaPaskaita;

import java.util.Comparator;


public class Vartotojas {
    private String name;
    private String lastName;
    private int age;
    private String city;

    public Vartotojas(String name, String lastName, int age, String city) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }


    public static Comparator<Vartotojas> sortByName = new Comparator<Vartotojas>() {
        @Override
        public int compare(Vartotojas o1, Vartotojas o2) {
            return o1.getName();
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }



}
