import java.util.ArrayList;
import java.util.List;

public class MainRegistry {

    private List<Employee> registeredEmployees = new ArrayList<>();

        public MainRegistry(){
            registeredEmployees.add(new Admin("Rosabel","3652"));
            registeredEmployees.add(new Intern("Kabob Teka","INT345"));
            registeredEmployees.add(new SecurityAnalyst("Botulinum","SOC5643"));
            registeredEmployees.add(new Intern("Bushing","2286"));
        }

      public void login(String name, String userID) throws Exception {


    for(Employee employee : registeredEmployees){
                if (employee.getName().equals(name)){

                          if(employee.userAuthentication(userID)){
                                            employee.accessSystem();
                                            employee.userActivity();
                                            return;
                                 }else{
                                     throw new Exception("Wrong user identification code...");
                                 }

                }
    }

          throw new Exception("Employee ".concat(name).concat(" Not found"));

      }


    public List<Employee> getRegisteredEmployees() {
        return registeredEmployees;
    }

    public void setRegisteredEmployees(List<Employee> registeredEmployees) {
        this.registeredEmployees = registeredEmployees;
    }


}
