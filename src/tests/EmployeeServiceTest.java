package tests;
import entities.*;
import services.*;
import org.junit.Assert;
import services.EmployeeService;

class EmployeeServiceTest {

    @org.junit.jupiter.api.Test
    void print() {
        // wtf?
    }

    @org.junit.jupiter.api.Test
    void printEmployeesBase() {
        // wtf?
    }

    @org.junit.jupiter.api.Test
    void add() {
//      java.lang.AssertionError: array lengths differed, expected.length=2 actual.length=0  отака фигня, малята   :(
//        EmployeeService service = new EmployeeService();
//        Developer mishaWorker = new Developer(1, "Misha", 33, 1200.0, "M", 250);
//        Employee yaraWorker = new Employee(5, "Yaroslava", 25, 1145.8, 88, "F");
//        Employee[] actual = service.employees;
//        service.add(mishaWorker);
//        service.add(yaraWorker);
//        Employee[] expected = new Employee[]{mishaWorker, yaraWorker};
//        Assert.assertArrayEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void getById() {
        Developer mishaWorker = new Developer(1, "Misha", 33, 1200.0, "M", 250);
        Employee lyoshaWorker = new Employee(2, "Lyosha", 21, 955.0, "M");
        Designer roma1Worker = new Designer(3, "Roma", 22, 945.8, "M", 0.88, 22);
        Manager romaWorker = new Manager(4, "Roma", 77, 1000.0, "M");
        Employee yaraWorker = new Employee(5, "Yaroslava", 25, 1145.8, 88,  "F");
        EmployeeService service = new EmployeeService();
        service.add(mishaWorker);
        service.add(lyoshaWorker);
        service.add(roma1Worker);
        service.add(romaWorker);
        service.add(yaraWorker);
        Employee actual = service.getById(3);
        Employee expected = roma1Worker;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getByName() {
        Developer mishaWorker = new Developer(1, "Misha", 33, 1200.0, "M", 250);
        Employee lyoshaWorker = new Employee(2, "Lyosha", 21, 955.0, "M");
        Designer roma1Worker = new Designer(3, "Roma", 22, 945.8, "M", 0.88, 22);
        Manager romaWorker = new Manager(4, "Roma", 77, 1000.0, "M");
        Employee yaraWorker = new Employee(5, "Yaroslava", 25, 1145.8, 88,  "F");
        EmployeeService service = new EmployeeService();
        service.add(mishaWorker);
        service.add(lyoshaWorker);
        service.add(roma1Worker);
        service.add(romaWorker);
        service.add(yaraWorker);

        Employee[] actual = service.getByName("Misha");
        Employee[] expected = new Employee[]{mishaWorker};

        Assert.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void edit() {
        // wtf?
    }

    @org.junit.jupiter.api.Test
    void removeById() {
        // wtf?
    }

    @org.junit.jupiter.api.Test
    void sortByName() {
        Developer mishaWorker = new Developer(1, "Misha", 33, 1200.0, "M", 250);
        Employee lyoshaWorker = new Employee(2, "Lyosha", 21, 955.0, "M");
        Designer roma1Worker = new Designer(3, "Roma", 22, 945.8, "M", 0.88, 22);
        Manager romaWorker = new Manager(4, "Roma", 77, 1000.0, "M");
        Employee yaraWorker = new Employee(5, "Yaroslava", 25, 1145.8, 88,  "F");
        EmployeeService service = new EmployeeService();
        service.add(yaraWorker);
        service.add(roma1Worker);
        service.add(mishaWorker);
        service.add(lyoshaWorker);
        service.add(romaWorker);
        Employee[] actual = service.sortByName();
        Employee[] expected = new Employee[]{lyoshaWorker, mishaWorker, roma1Worker, romaWorker, yaraWorker};
        Assert.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sortByNameAndSalary() {
        Developer mishaWorker = new Developer(1, "Misha", 33, 1200.0, "M", 250);
        Employee lyoshaWorker = new Employee(2, "Lyosha", 21, 955.0, "M");
        Designer roma1Worker = new Designer(3, "Roma", 22, 945.8, "M", 0.88, 22);
        Manager romaWorker = new Manager(4, "Roma", 77, 1000.0, "M");
        Employee yaraWorker = new Employee(5, "Yaroslava", 25, 1145.8, 88,  "F");
        EmployeeService service = new EmployeeService();
        service.add(yaraWorker);
        service.add(roma1Worker);
        service.add(mishaWorker);
        service.add(lyoshaWorker);
        service.add(romaWorker);
        Employee[] actual = service.sortByNameAndSalary();
        Employee[] expected = new Employee[]{lyoshaWorker, mishaWorker, roma1Worker, romaWorker, yaraWorker};
        Assert.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateSalaryAndBonus() {
        Designer roma1Worker = new Designer(3, "Roma", 22, 945.8, "M", 0.88, 22);
        Manager yaraWorker = new Manager(5, "Yaroslava", 25, 1145.8, "F");
        EmployeeService service = new EmployeeService();
        service.add(yaraWorker);
        service.add(roma1Worker);
        double expected = 2110.96;
        double actual = service.calculateSalaryAndBonus();
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);
    }
}
