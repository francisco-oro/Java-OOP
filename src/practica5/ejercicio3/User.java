package practica5.ejercicio3;

import java.util.*;

class User {
    private String name;
    private String surname;
    private String username;
    private String email;
    private String phone;
    private List<Contact> contacts;
    private Suscription currentSuscription;



    public User(String name, String email, Suscription suscription) {
        this.name = name;
        this.email = email;
        this.currentSuscription = suscription;
        this.contacts = new ArrayList<>();
    }

    public User(String name, String surname, String email, List<Contact> contacts) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.contacts = contacts;
    }

    public void updateSuscription(Suscription suscription, String paymentType)
    {
        Date date = new Date();
        this.currentSuscription = suscription;
        System.out.println("New suscription has been added. Here's a summary of what you've bought");
        System.out.println("License " + suscription.getName() + " Cost: " + suscription.getCost() +
                " Date: " + date.toString() + paymentType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        this.contacts.remove(contact);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Suscription getCurrentSuscription() {
        return currentSuscription;
    }

    public void setCurrentSuscription(Suscription currentSuscription) {
        this.currentSuscription = currentSuscription;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}