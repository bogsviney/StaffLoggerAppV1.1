package tests;
import entities.*;
import services.*;


public class Test {

    EmployeeService service = new EmployeeService();

    public Test() {
//        testManualEmployeesAdding();
//        testDefaultEmployeesAdding();
//        testRandomEmployeesSpawning();
//        testPrintAllDatabase();
//        testSearchByName();
//        testSearchById();
//        testCalculateSalaryAndBonus();
//        testRemoveById();
//        testSortByName();
//        testSortByNameAndSalary();
//        testEditInfo();

    }

    String ANSI_GREEN = "\u001B[32m";

    void testEditInfo() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "========================================   EDIT PROFILE INFO   =====================================================");
        Manager newUpdatedLyosha = new Manager(1, "ALEXEY", 29, 5000.0, "M");

        service.print(service.edit(newUpdatedLyosha));
        System.out.println(ANSI_GREEN + "=======================================   UPDATED INFO:   ==========================================================");
        System.out.println(service.getById(newUpdatedLyosha.getId()));;
    }

    public void testRandomEmployeesSpawning() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "========================================RANDOM WORKERS CREATING=====================================================");
        EmployeeFactory factory = new EmployeeFactory(); //ботоферма
        Employee[] randomEmployees = factory.getRandomEmployees(10);
        EmployeeService service = new EmployeeService(randomEmployees);
        service.printEmployeesBase();
    }

    public void testDefaultEmployeesAdding() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "======================================== DEFAULT WORKERS ADDING =====================================================");
        EmployeeFactory factory = new EmployeeFactory();
        Employee[] defaultEmployees = factory.getDefaultEmployees();
        EmployeeService service = new EmployeeService(defaultEmployees);
        service.printEmployeesBase();
    }

    void testManualEmployeesAdding() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "====================================== MANUAL WORKERS SPAWNING =====================================================");
        EmployeeFactory factory = new EmployeeFactory();
        Developer mishaWorker = new Developer(1, "Misha", 33, 1200.0, "M", 250);
        Employee lyoshaWorker = new Employee(2, "Lyosha", 21, 955.0, "M");
        Designer roma1Worker = new Designer(3, "Roma", 22, 945.8, "M", 0.88, 22);
        Manager romaWorker = new Manager(4, "Roma", 77, 1000.0, "M");
        Employee yaraWorker = new Employee(5, "Yaroslava", 25, 1145.8, 88,  "F");

        service.add(mishaWorker);
        service.add(lyoshaWorker);
        service.add(roma1Worker);
        service.add(romaWorker);
        service.add(yaraWorker);


        service.printEmployeesBase();


    }


    public void testPrintAllDatabase() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=======================================  DATABASE PRINTING  ========================================================");
        service.printEmployeesBase();
    }

    void testSearchById() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=======================================    SEARCHING BY ID   =======================================================");
        service.print(service.getById(1));
    }

    void testSearchByName() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=======================================   SEARCHING BY NAME   ======================================================");
        for (Employee employee : service.getByName("Roma")) {
            System.out.println(employee);
        }

        service.getByName("Gooch Brown");
    }

    public void testCalculateSalaryAndBonus() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=========================================    SALARY FUND   =========================================================");
        service.calculateSalaryAndBonus();
    }

    public void testRemoveById() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=======================================    REMOVING BY ID    =======================================================");
        service.removeById(6666);
    }

    public void testSortByName() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "======================================   SORTING BY THE NAME   =====================================================");
        service.sortByName();
        service.printEmployeesBase();
    }

    void testSortByNameAndSalary() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=================================   SORTING BY THE NAME AND SALARY  ================================================");
        service.sortByNameAndSalary();
        service.printEmployeesBase();
    }

}
