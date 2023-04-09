package lesson6HW;

public class Laptop {

    protected String brand;
    protected String model;
    protected int cdu;
    protected int hdd;
    protected int ram;
    protected String os;
    protected String color;

    public Laptop(String brand, String model, int cdu, int hdd, int ram, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.cdu = cdu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.color = color;
    }
}
