package practica5.ejercicio3;

import java.util.*;
public class Agenda {
    private List<Contact> contacts;
    private User user;
    private int maxContacts;

    public Agenda() {
        contacts = new ArrayList<Contact>();
        user = new User("John Doe", "johndoe@example.com");
    }

    public void addContact(Contact contact) {
        if (contacts.size() <= maxContacts)
            contacts.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " + contact.getPhone() + " " + contact.getEmail());
        }
    }

    public void editUserInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        user.setName(sc.nextLine());
        System.out.print("Ingrese su apellido: ");
        user.setSurname(sc.nextLine());
        System.out.print("Ingrese su nickname: ");
        user.setNickname(sc.nextLine());
        System.out.print("Ingrese su teléfono: ");
        user.setPhone(sc.nextLine());
        System.out.print("Ingrese su correo: ");
        user.setEmail(sc.nextLine());
    }

    public void deleteContact(int index) {
        contacts.remove(index);
    }

    public void searchContact(String nameOrPhone) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(nameOrPhone) || contact.getPhone().equals(nameOrPhone)) {
                System.out.println(contact.getName() + " " + contact.getEmail() + "  " + contact.getPhone());
                return;
            }
        }
        System.out.println("The contact has not been found");
    }


    public int getMaxContacts() {
        return maxContacts;
    }

    public void setMaxContacts(int maxContacts) {
        this.maxContacts = maxContacts;
    }
}