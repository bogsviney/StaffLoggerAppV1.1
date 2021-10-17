public class Test {

    EmployeeService service = new EmployeeService();

    public Test() {
        testManualEmployeesAdding();
        testDefaultEmployeesAdding();
        testRandomEmployeesSpawning();
        testPrintAllDatabase();
        testSearchById();
        testSearchByName();
        testCalculateSalaryAndBonus();
        testRemoveById();
        testSortByName();
        testSortByNameAndSalary();
    }

    String ANSI_GREEN = "\u001B[32m";

    void testRandomEmployeesSpawning() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "========================================RANDOM WORKERS CREATING=====================================================");
        EmployeeFactory factory = new EmployeeFactory(); //ботоферма
        Employee[] randomEmployees = factory.getRandomEmployees(10);
        EmployeeService service = new EmployeeService(randomEmployees);
        service.printEmployeesBase();
    }

    void testDefaultEmployeesAdding() {
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
        Developer mishaWorker = new Developer(1212, "Misha", 33, 1200.0, "M", 250);
        Manager lyoshaWorker = new Manager(6617, "Lyosha", 21, 955.0, "M");
        Designer roma1Worker = new Designer(2314, "Roma", 22, 945.8, "M", 0.88, 22);
        Employee romaWorker = new Employee(6666, "Roma", 77, 10000, 421212, 11, "M");
        Employee yaraWorker = new Employee(5432, "Yaroslava", 25, 1145.8, 88, 1.88, "F");

        service.add(lyoshaWorker);
        service.add(roma1Worker);
        service.add(romaWorker);
        service.add(yaraWorker);
        service.add(mishaWorker);

        service.printEmployeesBase();

    }


    void testPrintAllDatabase() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=======================================  DATABASE PRINTING  ========================================================");
        service.printEmployeesBase();
    }

    void testSearchById() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=======================================    SEARCHING BY ID   =======================================================");
        service.print(service.getById(5432));
    }

    void testSearchByName() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=======================================   SEARCHING BY NAME   ======================================================");
        for (Employee employee : service.getByName("Roma")) {
            System.out.println(employee);
        }

        service.getByName("Gooch Brown");
    }

    void testCalculateSalaryAndBonus() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=========================================    SALARY FUND   =========================================================");
        service.calculateSalaryAndBonus();
    }

    void testRemoveById() {
        System.out.println(ANSI_GREEN + "================================================TEST================================================================");
        System.out.println(ANSI_GREEN + "=======================================    REMOVING BY ID    =======================================================");
        service.removeById(6666);
    }

    void testSortByName() {
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
