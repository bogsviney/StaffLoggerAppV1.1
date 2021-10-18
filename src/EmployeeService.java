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

    //just for fun ^^
    void consoleUserInterface() {
        System.out.println();
        System.out.println();
        System.out.println("==============================PRESS THE NUMBERS ON KEYBOARD TO FOLLOW THE COMMANDS===============================================");
        System.out.println("=====1 to HIRE  =====2 to PRINT info   =====3 to print all DATABASE  =====4 to CALCULATE TOTAL SALARY  =====5 to search by NAME  ");
        System.out.println("=====6 to search by ID    =====7 to        =====8 to        =====9 to      =====0 to EXIT program ===============================");
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();
        switch (numberFromUser) {
            case 1:
//                       addingToDatabase(пока хз как это );
                consoleUserInterface();
                break;
            case 2:
//                        printEmployee(пока хз как это);
                consoleUserInterface();
                break;
            case 3:
                printEmployeesBase();
                consoleUserInterface();
                break;
            case 4:
                calculateSalaryAndBonus();
                consoleUserInterface();
                break;
            case 5:    // НЕ СЧИТЫВАЕТ СТРОЧКУ
//                        String name = scanner.nextLine();
//                        System.out.println(ANSI_GREEN + "Enter the name and press ENTER to search");
//                        getByName(name);
//                        UserInterface();
//                        break;
            case 6:
                System.out.println("Enter the ID number and press ENTER to search");
                long id = scanner.nextInt();
                getById(id);
                consoleUserInterface();
                break;
            case 7:
                System.out.println("Enter the ID number to delete from database");
                id = scanner.nextLong();
                System.out.println("Worker with ID " + id + " was deleted");
                System.out.println(removeById(id));
                consoleUserInterface();
                break;
            case 8:

                consoleUserInterface();
                break;
            case 9:

                consoleUserInterface();
                break;
            case 0:   //EXIT
                break;
            default:
                consoleUserInterface();

        }
    }
}
