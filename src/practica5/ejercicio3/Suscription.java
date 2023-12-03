package practica5.ejercicio3;

import java.util.Date;

public class Suscription {
    private double cost;
    private String name;
    private int maxContacts;

    public Suscription(double cost, String name, int maxContacts) {
        this.cost = cost;
        this.name = name;
        this.maxContacts = maxContacts;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxContacts() {
        return maxContacts;
    }

    public void setMaxContacts(int maxContacts) {
        this.maxContacts = maxContacts;
    }
}
