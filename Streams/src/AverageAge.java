import java.util.Map;
import java.util.stream.Collectors;

public class AverageAge {

    public static void main (String[] args){

        EmployeeList employeeListObj = new EmployeeList();

        Map<String, Double> AverageAge = employeeListObj.employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(AverageAge);
    }
}
