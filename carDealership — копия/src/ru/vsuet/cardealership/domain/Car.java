package ru.vsuet.cardealership.domain;

public class Car {
    private Long id;
    private String mod;
    private String mar;

    public Car(Long id, String mod, String mar){
        this.id = id;
        this.mod = mod;
        this.mar = mar;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public Long getId() {
        return id;
    }

    public String getMar() {
        return mar;
    }

    public String getMod() {
        return mod;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mod='" + mod + '\'' +
                ", mar='" + mar + '\'' +
                '}';
    }
}
