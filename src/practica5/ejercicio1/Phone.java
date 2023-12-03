package practica5.ejercicio1;
        import java.util.*;

public class Phone {
    private UserInformation userInformation;
    private PhoneConfiguration phoneConfiguration;
    private boolean isLocked = true;

    public Phone(UserInformation userInformation, PhoneConfiguration phoneConfiguration) {
        this.userInformation = userInformation;
        this.phoneConfiguration = phoneConfiguration;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public PhoneConfiguration getPhoneConfiguration() {
        return phoneConfiguration;
    }

    public void call(String number) {
        if (!this.isLocked)
            System.out.println("Calling " + number);
    }

    public void unlock(String patternLock) {
        if (this.phoneConfiguration.getPatternLock() == patternLock)
            this.isLocked = false;
    }

    public void exit()
    {
        System.out.println("Locking system");
        this.isLocked = true;
    }

    public void openContacts() {
        if (this.isLocked == false)
        System.out.println("You have no recent contacts for now");
    }

    public void setUserInformation(UserInformation userInformation) {
        if (this.isLocked == false)
        this.userInformation = userInformation;
    }

    public void setPhoneConfiguration(PhoneConfiguration phoneConfiguration) {
        if (this.isLocked == false)
        this.phoneConfiguration = phoneConfiguration;
    }
}