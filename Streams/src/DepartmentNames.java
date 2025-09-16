import java.util.stream.Collectors;

public class DepartmentNames {

    public static  void main (String[] args){

        EmployeeList employeeListObj = new EmployeeList();
        employeeListObj.employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }
}
