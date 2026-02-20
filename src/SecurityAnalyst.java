public class SecurityAnalyst extends Employee implements AuthenticationInterface{

public SecurityAnalyst(String name , String employeeID){
    super(name,employeeID);
}


    @Override
    public boolean userAuthentication(String password) {

      return password.equals(getEmployeeID());
}
    @Override
    public void userActivity() {
        IO.println("SOC Analyst now online...");
    }
    @Override
    public void accessSystem() {
    IO.println("Security Analyst : " + super.getName() + ",Accessing System...");
    }
}
