package practica5.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Create a new Phone object
        UserInformation userInformation = new UserInformation("Francisco", "Oro", "franciscooro@mail.com");

        Phone phone = new Phone(userInformation,
                new PhoneConfiguration(true, true, "1234567890"));

        // Create a new UserInformation object
        UserInformation userInfo = new UserInformation("John" ,"Doe", "johndoe@example.com");

        phone.unlock("1234567890");
        // Set the phone's user information
        phone.setUserInformation(userInfo);

        // Test the phone's methods
        phone.call("1234567890");
        phone.openContacts();

        // Test the UserInformation object's methods
        userInfo.setName("Jane Doe");
        userInfo.setEmail("janedoe@example.com");
        System.out.println(userInfo.getName());
        System.out.println(userInfo.getEmail());
    }
}