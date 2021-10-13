public class Test {
    public static void main(String[] args) {

        Employee grishaWorker = new Employee(1212, "GRISHA", 33, 1200.0, 100, 2.5, "M");
        Employee lyoshaWorker = new Employee(6617, "LYOSHA", 21, 955.0, 56, 1.00, "M");
        Employee romaWorker = new Employee(2314, "ROMA", 40, 945.8, 45, 0.88, "M");

        EmployeeService service = new EmployeeService();

        service.addingToDatabase(grishaWorker);
        service.addingToDatabase(lyoshaWorker);
        service.addingToDatabase(romaWorker);

//        service.printEmployee(grishaWorker);

//        service.printEmployeesBase();

//        service.getById(2314);

//        service.getByName("ROMA");
//        service.getByName("ANTON"); // (Такого в базе нет)
//        service.getById(6617);

        service.calculateSalaryAndBonus();




    }
}
