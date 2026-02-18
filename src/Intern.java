public class Intern extends Employee implements AuthenticationInterface{

    public Intern(String name, String employeeID) {
        super(name, employeeID);
    }

    @Override
    public void accessSystem() {
        IO.println("Intern "+super.getName()+" Accessing System");
    }

    @Override
    public boolean userAuthentication(String userName, String userID) {
        return super.getName().equals(userName) && super.getEmployeeID().equals(userID);
    }
}
