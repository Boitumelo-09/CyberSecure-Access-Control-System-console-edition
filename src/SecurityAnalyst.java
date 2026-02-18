public class SecurityAnalyst extends Employee implements AuthenticationInterface{

public SecurityAnalyst(String name , String employeeID){
    super(name,employeeID);
}


    @Override
    public boolean userAuthentication(String userName, String userID) {
        return super.getName().equals(userName) && super.getEmployeeID().equals(userID);
    }

    @Override
    public void accessSystem() {
    IO.println("Security Analyst : " + super.getName() + ",Accessing System...");
    }
}
