package VolkhinEO.Lb3;

import java.util.Set;

public class Tavar {
    private String name;
    private int price;

    public Tavar() {
    }

    public Tavar(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
