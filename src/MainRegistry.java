import java.util.ArrayList;
import java.util.List;

public class MainRegistry {

    private List<Employee> registeredEmployees = new ArrayList<>();

        public MainRegistry(){
            registeredEmployees.add(new Admin("Rosabel","3652"));
            registeredEmployees.add(new Intern("Kabob Teka","INT345"));
            registeredEmployees.add(new SecurityAnalyst("Botulinum","SOC5643"));
        }

      public void login(String name, String userID) throws Exception {
               int index = -1;
    for(Employee employee : registeredEmployees){
                if (employee.getName().equals(name) && employee.getEmployeeID().equals(userID)){

                      index = registeredEmployees.indexOf(employee);

                }
    }
            if (index < 0){
                throw new Exception("Employee ".concat(name).concat(" Not found"));
            }
                 registeredEmployees.get(index).accessSystem();
      }


    public List<Employee> getRegisteredEmployees() {
        return registeredEmployees;
    }

    public void setRegisteredEmployees(List<Employee> registeredEmployees) {
        this.registeredEmployees = registeredEmployees;
    }
}
