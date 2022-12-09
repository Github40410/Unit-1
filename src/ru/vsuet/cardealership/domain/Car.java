package ru.vsuet.cardealership.domain;

public class Car {
    private Long id;
    private String mod;
    private String mar;
    private Long idType;

    public Car(Long id, String mod, String mar, Long idType){
        this.id = id;
        this.mod = mod;
        this.mar = mar;
        this.idType = idType;
    }

    public Car(String mod, String mar){
        this.mod = mod;
        this.mar = mar;
    }

    public Car(Long id, String mod, String mar){
        this.id = id;
        this.mod = mod;
        this.mar = mar;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getIdType() {
        return idType;
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
