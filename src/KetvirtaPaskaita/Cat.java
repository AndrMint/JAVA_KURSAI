package KetvirtaPaskaita;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;
    private String kind;

    public Cat(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;
        return kind != null ? kind.equals(cat.kind) : cat.kind == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {

        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kind='" + kind + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return name.compareTo(o.getName());
    }
}
