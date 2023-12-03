package practica6.ejercicio1;

import java.util.*;

public class User {
    private String name;
    private String surname;
    private String phone;
    private String email;
    private List<Ticket> tickets = new ArrayList<Ticket>();

    public User(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public boolean buyTickets(int asientos, Funcion function)
    {
        if (asientos <= 4 && asientos >= 1)
        {
            Ticket newTicket = new Ticket(asientos,function)
            this.tickets.add(newTicket);
            return true;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
