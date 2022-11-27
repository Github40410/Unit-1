package ru.vsuet.cardealership.domain;

public class Bayer {
    private Long id;
    private int age;
    private String name;
    private static enum Gender{MALE, FEMALE};
    private Gender gender;

    public Bayer(Long id, int age, String name, Gender gender){
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bayer{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
