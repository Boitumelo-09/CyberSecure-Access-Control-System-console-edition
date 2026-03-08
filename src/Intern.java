public class Intern extends Employee implements AuthenticationInterface{

    public Intern(String name, String employeeID) {
        super(name, employeeID);
    }

    @Override
    public void accessSystem() {
        IO.println("Intern "+super.getName()+" Accessing System");
    }
    @Override
    public void userActivity() {
        IO.println("Intern now working online...");
    }

    @Override
    public void greetingColleagues() {

            IO.println("Hello i am , Intern ".concat(getName()));

    }

    @Override
    public boolean userAuthentication(String password) {
        return password.equals(getEmployeeID());
    }
}
