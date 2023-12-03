package practica5.ejercicio1;

public class PhoneConfiguration {
    private boolean addUser;
    private boolean enableEmergencyCalls;
    private String patternLock;

    public PhoneConfiguration(boolean addUser, boolean enableEmergencyCalls, String patternLock) {
        this.addUser = addUser;
        this.enableEmergencyCalls = enableEmergencyCalls;
        this.patternLock = patternLock;
    }

    public boolean isAddUser() {
        return addUser;
    }

    public boolean isEnableEmergencyCalls() {
        return enableEmergencyCalls;
    }

    public String getPatternLock() {
        return patternLock;
    }
}
