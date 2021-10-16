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
    final int numberOfEmployees = 5; //максимальное количество рабочих мест в компании
    Employee[] employees = new Employee[numberOfEmployees];

    void printEmployee(Employee employee) {
        System.out.println(PURPLE + "======================================   WARNING: EMPLOYEE INFO is printing:   =====================================");
        System.out.println(PURPLE + "------------------------------------");
        System.out.print(PURPLE + "This is the worker! ");
        System.out.println();
        System.out.println(PURPLE + "id = " + employee.getId());
        System.out.print(PURPLE + "age = " + employee.getAge());
        System.out.print(PURPLE + ", name = " + employee.getName());
        System.out.print(PURPLE + ", gender: = " + employee.getGender() + ", ");
        System.out.println();
        System.out.print(PURPLE + "$ = " + employee.getSalary() + ",");
        System.out.println();
        System.out.print(PURPLE + "Bugs fixed: " + employee.getFixedBugs());
        System.out.print(PURPLE + ", Bug Rate: " + employee.getDefaultBugRate() + " $");
        System.out.println();
        System.out.println(PURPLE + "------------------------------------");
    }

    void printEmployeesBase() {
        System.out.println(PURPLE + "======================================   WARNING:  database is printing:   =========================================");
        for (int i = 0; i < employees.length; i++) {
            printEmployee(employees[i]);
        }
    }

    void addingToDatabase(Employee employee) {
        employees[employeesCounter] = employee;
        employeesCounter++;
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

    Employee edit(Employee employee) {
        if (employee == null) {
            return null;
        }
        Employee updatedEmployee = getById(employee.getId());
        if (updatedEmployee == null) {
            return null;
        }
        updatedEmployee.setName(employee.getName());
        updatedEmployee.setName(employee.getName());
        updatedEmployee.setName(employee.getName());
        updatedEmployee.setName(employee.getName());
        updatedEmployee.setName(employee.getName());
        updatedEmployee.setName(employee.getName());
        return employee;
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
        for (int i = 0; i < employees.length; i++) { // i = 2, indexToRemove = 2
            // newArrayCounter = 1;
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
            companyTotalSalaryAmount += employees[i].getFixedBugs() * employees[i].getDefaultBugRate() + employees[i].getSalary();
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
