package ru.vsuet.cardealership.domain;

public class Bayer {
    private Long id;
    private Long age;
    private String name;
    private static Gender gender;

    public Bayer(Long id, Long age, String name, Gender gender){
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Bayer(Long age, String name, Gender gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Long getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
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
