public class Test {

    EmployeeService service = new EmployeeService();

    public Test() {
        testRandomEmployeesSpawning();
        testManualEmployeeAdding();
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
        System.out.println(ANSI_GREEN+"================================================TEST================================================================");
        System.out.println(ANSI_GREEN+"========================================RANDOM WORKERS CREATING=====================================================");
        EmployeeFactory factory = new EmployeeFactory(); //ботоферма
        Employee[] randomEmployees = factory.getRandomEmployees(5);
        EmployeeService service = new EmployeeService(randomEmployees);
        service.printEmployeesBase();
    }

    void testManualEmployeeAdding() {
        System.out.println(ANSI_GREEN+"================================================TEST================================================================");
        System.out.println(ANSI_GREEN+"======================================== MANUAL WORKERS ADDING =====================================================");

        Employee grishaWorker = new Employee(1212, "Grisha", 33, 1200.0, 100, 2.5, "M");
        Employee lyoshaWorker = new Employee(6617, "Lyosha", 21, 955.0, 56, 1.00, "M");
        Employee roma1Worker = new Employee(2314, "Roma", 22, 945.8, 45, 0.88, "M");
        Employee romaWorker = new Employee(6666, "Roma", 77, 10000, 421212, 11, "M");
        Employee yaraWorker = new Employee(5432, "Yaroslava", 25, 1145.8, 88, 1.88, "F");
        service.addingToDatabase(grishaWorker);
        service.addingToDatabase(lyoshaWorker);
        service.addingToDatabase(roma1Worker);
        service.addingToDatabase(romaWorker);
        service.addingToDatabase(yaraWorker);
    }

    void testPrintAllDatabase() {
        System.out.println(ANSI_GREEN+"================================================TEST================================================================");
        System.out.println(ANSI_GREEN+"=======================================  DATABASE PRINTING  ========================================================");
        service.printEmployeesBase();
    }

    void testSearchById() {
        System.out.println(ANSI_GREEN+"================================================TEST================================================================");
        System.out.println(ANSI_GREEN+"=======================================    SEARCHING BY ID   =======================================================");
        service.printEmployee(service.getById(5432));
    }

    void testSearchByName() {
        System.out.println(ANSI_GREEN+"================================================TEST================================================================");
        System.out.println(ANSI_GREEN+"=======================================   SEARCHING BY NAME   ======================================================");
        for (Employee employee : service.getByName("Roma")) {
            System.out.println(employee);
        }

        service.getByName("Gooch Brown");
    }

    void testCalculateSalaryAndBonus() {
        System.out.println(ANSI_GREEN+"================================================TEST================================================================");
        System.out.println(ANSI_GREEN+"=========================================    SALARY FUND   =========================================================");
        service.calculateSalaryAndBonus();
    }

    void testRemoveById() {
        System.out.println(ANSI_GREEN+"================================================TEST================================================================");
        System.out.println(ANSI_GREEN+"=======================================    REMOVING BY ID    =======================================================");
        service.removeById(6666);
    }

    void testSortByName() {
        System.out.println(ANSI_GREEN+"================================================TEST================================================================");
        System.out.println(ANSI_GREEN+"======================================   SORTING BY THE NAME   =====================================================");
        service.sortByName();
        service.printEmployeesBase();
    }

    void testSortByNameAndSalary() {
        System.out.println(ANSI_GREEN+"================================================TEST================================================================");
        System.out.println(ANSI_GREEN+"=================================   SORTING BY THE NAME AND SALARY  ================================================");
        service.sortByNameAndSalary();
        service.printEmployeesBase();
    }


//    void testEditEmployeeParameters(){
//        service.edit(grishaWorker);
//
//    }

}
