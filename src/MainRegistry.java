import java.util.ArrayList;
import java.util.List;

public class MainRegistry {

    private List<Employee> registeredEmployees = new ArrayList<>();

        public MainRegistry(){
            registeredEmployees.add(new Admin("Rosabel","3652"));
            registeredEmployees.add(new Intern("Kabob Teka","INT345"));
            registeredEmployees.add(new SecurityAnalyst("Boitumelo","SOC5643"));
        }



    public List<Employee> getRegisteredEmployees() {
        return registeredEmployees;
    }

    public void setRegisteredEmployees(List<Employee> registeredEmployees) {
        this.registeredEmployees = registeredEmployees;
    }
}
