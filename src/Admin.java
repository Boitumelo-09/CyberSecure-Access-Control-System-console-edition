

public class Admin extends Employee implements AuthenticationInterface {


    public Admin(String name, String employeeID) {
        super(name, employeeID);
    }

    @Override
    public boolean userAuthentication(String userName, String userID) {
        return false;
    }

    @Override
    public void accessSystem() {
        IO.println("Admin " + super.getName()+ ", Entering System...");
    }
}
