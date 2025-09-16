import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class GenderCount {

    public static void main (String[] args){

        EmployeeList employeeListObj = new EmployeeList();

        Map<String,Long> GenderCount = employeeListObj.employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(GenderCount);
    }
}
