import com.app.employee.Employee;
import com.app.employee.developer.Developer;
import com.app.employee.manager.Manager;
import com.app.employee.salesperson.SalesPerson;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee salesPerson = new SalesPerson();

        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(developer);
        employees.add(salesPerson);

        for (Employee employee : employees) {
            employee.name();
            employee.salary();
            employee.bonus();
            employee.ProgrammingLanguage();
            employee.Commission();
        }
    }
}
