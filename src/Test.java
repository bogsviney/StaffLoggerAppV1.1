public class Test {
    public static void main(String[] args) {

        Employee grishaWorker = new Employee(1212, "GRISHA", 33, 1200.0, 100, 2.5, "M");
        Employee lyoshaWorker = new Employee(6617, "LYOSHA", 21, 955.0, 56, 1.00, "M");
        Employee romaWorker = new Employee(2314, "ROMA", 22, 945.8, 45, 0.88, "M");
        Employee yaraWorker = new Employee(5432, "YARA", 25, 1145.8, 88, 1.88, "F");

        EmployeeService service = new EmployeeService(); //создаю свой отдел кадров

//        //ПРИЕМ НА РАБОТУ
        service.addingToDatabase(grishaWorker); //вносим в базу работников
        service.addingToDatabase(lyoshaWorker);
        service.addingToDatabase(romaWorker);
        service.addingToDatabase(yaraWorker);
//
//        //ИНФОРМАЦИЯ
//        service.printEmployee(grishaWorker); //печать инфы отдельного работника
//        service.printEmployeesBase(); //печать инфы всех работников фирмы
//
//
//        //ПОИСК
//        service.getById(6617);
//        service.getById(2313);// (Такого в базе нет,должно выводить сообщение что нет такого)
//        service.getByName("ROMA");
//        service.getByName("ANTON"); // (Такого в базе нет,должно выводить сообщение что нет такого)
//
//
//        //ФИНАНСЫ
//        service.calculateSalaryAndBonus(); // просчет зарплатного фонда компании, бонусы и ставка



        //ЧИСТО ПО ФАНУ СКРУТИТЬ ЧТОБ МОЖНО БЫЛО УПРАВЛЯТЬ С КОНСОЛИ
//        service.userInterface();
//    команды в консоли цифрами
//    1)  нанять          2)  напечатать инфу      3)   печать всей базы       4) ФИНАНСЫ       5) Поиск по имени
//    6) поиск по АйДи    7)                       8)                          9)               0) EXIT program


    }
}
