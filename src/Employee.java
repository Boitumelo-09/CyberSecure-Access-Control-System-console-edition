

public abstract class Employee extends Person implements AuthenticationInterface{
       private String employeeID;
       private int clearanceLevel;
       private String jobTitle;

    public Employee(String name,String employeeID) {
        super(name);
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public int getClearanceLevel() {
        return clearanceLevel;
    }
    public void setClearanceLevel(int clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public abstract void accessSystem();

}
