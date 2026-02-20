

public class Admin extends Employee implements AuthenticationInterface {


    public Admin(String name, String employeeID) {
        super(name, employeeID);
    }

    @Override
    public boolean userAuthentication(String password) {
        return password.equals(getEmployeeID());
    }

    @Override
    public void userActivity() {
           IO.println("Administrator now online...");
    }

    @Override
    public void accessSystem() {
        IO.println("Admin " + super.getName()+ ", Entering System...");
    }
}
