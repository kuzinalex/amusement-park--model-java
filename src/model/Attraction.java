package model;

public class Attraction {
    private int price;
    private String name;
    private String description;
    private int[] parametres;

    public Attraction(int price, String name, String description, int[] parametres) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.parametres = parametres;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getParametres() {
        return parametres;
    }

    public void setParametres(int[] parametres) {
        this.parametres = parametres;
    }
}
