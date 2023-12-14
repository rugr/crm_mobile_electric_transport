package com.vntu.pipz.crm_mobile_electric_transport.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;

    @Column(name = "power")
    private int power;

    @Column(name = "battery_energy")
    private int batteryEnergy;

    @Column(name = "range")
    private int range;

    @Column(name = "speed")
    private int speed;

    public Product() {}

    public Product(Long id, String title, int price, int power, int batteryEnergy, int range, int speed) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.power = power;
        this.batteryEnergy = batteryEnergy;
        this.range = range;
        this.speed = speed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getBatteryEnergy() {
        return batteryEnergy;
    }

    public void setBatteryEnergy(int batteryEnergy) {
        this.batteryEnergy = batteryEnergy;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", power=" + power +
                ", batteryEnergy=" + batteryEnergy +
                ", range=" + range +
                ", speed=" + speed +
                '}';
    }
}
