public class EmployeeService {

    int employeesCounter = 0;
    final int numberOfEmployees = 3; //максимальное количество рабочих мест в компании
    Employee[] employees = new Employee[numberOfEmployees];
    String[] names = new String[numberOfEmployees];
    String[] genders = new String[numberOfEmployees];
    long[] iDs = new long[numberOfEmployees];
    int[] age = new int[numberOfEmployees];
    double[] salaries = new double[numberOfEmployees];
    int[] fixedBugsByEmployee = new int[numberOfEmployees];
    double[] defaultBugRates = new double[numberOfEmployees];

//________________METHODS________________________________

    void printEmployee(Employee employee) {
        System.out.println("================================= WARNING: EMPLOYEE INFO is printing! ===========================================");
        System.out.println("------------------------------------");
        System.out.print("This is the worker! ");
        System.out.println();
        System.out.println("id = " + employee.id);
        System.out.print("age = " + employee.age);
        System.out.print(", name = " + employee.name);
        System.out.print(", gender: = " + employee.gender + ", ");
        System.out.println();
        System.out.print("$ = " + employee.salary + ",");
        System.out.println();
        System.out.print("Bugs fixed: " + employee.fixedBugs);
        System.out.print(", Bug Rate: " + employee.defaultBugRate + " $");
        System.out.println();
        System.out.println("------------------------------------");
    }

    void printEmployeesBase() {
        System.out.println("================================= WARNING: EMPLOYEE database is printing: ===========================================");
        for (int i = 0; i < employees.length; i++) {
            printEmployee(employees[i]);
        }
    }

    void addingToDatabase(Employee employee) {

        employees[0 + employeesCounter] = employee;
        names[0 + employeesCounter] = employee.name;
        age[0 + employeesCounter] = employee.age;
        iDs[0 + employeesCounter] = employee.id;
        salaries[0 + employeesCounter] = employee.salary;
        fixedBugsByEmployee[0 + employeesCounter] = employee.fixedBugs;
        defaultBugRates[0 + employeesCounter] = employee.defaultBugRate;
        genders[0 + employeesCounter] = employee.gender;
        employeesCounter++;
        System.out.println("================================= WARNING: EMPLOYEE " + employee.name + " data added ============================================================");
    }

    void getById(long iD) {
        boolean isMatch = false;
        for (int i = 0; i < iDs.length; i++) {
            if (iDs[i] == iD) {
                System.out.println("================================= WARNING: SEARCHING by ID:" + iD + "  ====================================================================");
                printEmployee(employees[i]);
                isMatch = true;

            }
        }
        if(!isMatch){
            System.out.println("================================= WARNING: SEARCHING by ID:" + iD + "  ====================================================================");
            System.out.println("blah blah we have no this data");
        }
    }

    void getByName(String name) {
        boolean isMatch = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.println("================================= WARNING: SEARCHING by NAME: " + name + "  ===============================================================");
                printEmployee(employees[i]);
                isMatch = true;

            }

        }

        if(!isMatch){
            System.out.println("================================= WARNING: SEARCHING by NAME: " + name + "  ===============================================================");
            System.out.println("OOOOOOOPS! we have no this data");
        }


    }

    double calculateSalaryAndBonus() {
        double companyTotalSalaryAmount = 0;
        for (int i = 0; i < fixedBugsByEmployee.length; i++) {
            companyTotalSalaryAmount += fixedBugsByEmployee[i] * defaultBugRates[i] + salaries[i];
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++TOTAL SALARY AMOUNT IS: " + companyTotalSalaryAmount + " $ ++++++++++++++++++++++++++++++++++++++");
        return companyTotalSalaryAmount;

    }

}
