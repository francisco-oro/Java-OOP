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

    public boolean buyTickets(int number, Funcion function)
    {
        if (number > 4 || number < 1)
            return false;
        this.tickets.add()
    }
}
