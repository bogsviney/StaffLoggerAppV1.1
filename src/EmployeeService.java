import java.util.*;

public class EmployeeService {
    String PURPLE = "\u001B[35m";
    String RED = "\u001B[31m";

    public EmployeeService() {

    }

    public EmployeeService(Employee[] employees) {

        this.employees = employees;
    }

    int employeesCounter = 0;
    final int numberOfEmployees = 0; //максимальное количество рабочих мест в компании
    Employee[] employees = new Employee[numberOfEmployees];

    void print(Employee employee) {
        System.out.println(employee);
    }

    void printEmployeesBase() {
        System.out.println(PURPLE + "======================================   WARNING:  database is printing:   =========================================");
        for (int i = 0; i < employees.length; i++) {
            print(employees[i]);
        }
    }

    void add(Employee employee) {
        if (employee != null) {
            Employee[] arrayTemporary = new Employee[employees.length + 1];
            for (int i = 0; i < employees.length; i++) {
                arrayTemporary[i] = employees[i];
            }
            arrayTemporary[arrayTemporary.length - 1] = employee;
            employees = arrayTemporary;
        }
        System.out.println(PURPLE + "======================================   WARNING: EMPLOYEE " + employee.getName() + " data added =========================================");
    }

    Employee getById(long iD) {
        System.out.println(PURPLE + "======================================   WARNING: SEARCHING by ID: " + iD + "   ==========================================");
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == iD) {
                return employee;
            }

        }
        System.out.println(PURPLE + "======================================   WARNING: SEARCHING by ID: " + iD + "   ==============================================");
        System.out.println(RED + "OOOOOOOPS! we have no ID " + iD + " in our data base");
        return null;
    }

    Employee[] getByName(String name) {
        System.out.println(PURPLE + "=================================   WARNING: SEARCHING by NAME: " + name + "   ======================================");
        if (name == null) {
            return null;
        }
        int isMatch = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name)) {
                isMatch++;
            }
        }
        if (isMatch == 0) {
            System.out.println(PURPLE + "=================================   WARNING: SEARCHING by NAME: " + name + "   ======================================");
            System.out.println(RED + "====================================   OOOOOOOPS! we have no name " + name + " in our data base  ====================");
            return null;
        }
        Employee[] temporary = new Employee[isMatch];
        int index = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name)) {
                temporary[index] = employee;
                index++;
            }
        }
        return temporary;
    }


    Employee edit(Employee employeeWithNewData) {
        System.out.println(PURPLE + "=================================   WARNING: EDITING PROFILE   =====================================================");
        Employee employeeOld = getById(employeeWithNewData.getId());

        for (int i = 0; i < employees.length; i++) {
            if (employeeOld.getId() == employees[i].getId()) {
                employees[i] = employeeWithNewData;
            }
        }
        return employeeOld;
    }

    Employee removeById(long id) {
        int indexToRemove = -1;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getId() == id) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            return null;
        }
        Employee[] newEmployeesArray = new Employee[employees.length - 1];
        int newArrayCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i != indexToRemove) {
                newEmployeesArray[newArrayCounter] = employees[i];
                newArrayCounter++;
            }
        }
        Employee removedEmployee = employees[indexToRemove];
        employees = newEmployeesArray;
        System.out.println(PURPLE + "======================================   WARNING: EMPLOYEE " + id + " data removed =======================================");
        return removedEmployee;
    }

    Employee[] sortByName() {
        Arrays.sort(employees, Comparator.comparing(Employee::getName));
        return employees;
    }

    Employee[] sortByNameAndSalary() {
        Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        return employees;
    }

    double calculateSalaryAndBonus() {
        double companyTotalSalaryAmount = 0;
        for (int i = 0; i < employees.length; i++) {
            companyTotalSalaryAmount += employees[i].calculateSalary();
        }
        System.out.println(PURPLE + "======================================== TOTAL SALARY AMOUNT IS: " + companyTotalSalaryAmount + " $ ===============================");
        return companyTotalSalaryAmount;
    }

    @Override
    public String toString() {

        return "Napalm Death";
    }

}

