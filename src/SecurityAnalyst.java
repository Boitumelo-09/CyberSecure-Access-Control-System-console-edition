public class SecurityAnalyst extends Employee implements AuthenticationInterface{

public SecurityAnalyst(String name , String employeeID){
    super(name,employeeID);
}

    @Override
    public boolean userAuthentication(String userName, String userID) {
        return false;
    }

    @Override
    public void accessSystem() {
    IO.println("Security Analyst : " + super.getName() + ",Accessing System...");
    }
}
