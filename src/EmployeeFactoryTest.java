import org.junit.Assert;
import org.junit.jupiter.api.Test;
class EmployeeFactoryTest {

    @Test
    void getRandomEmployees() {
        //очень хз как его делать...
    }

    @Test
    void getDefaultEmployees() {
        Employee grishaWorker = new Employee(1212, "Grisha", 33, 1200.0, 100, "M");
        Employee lyoshaWorker = new Employee(6617, "Lyosha", 21, 955.0, 56, "M");
        Employee roma1Worker = new Employee(2314, "Roma", 22, 945.8, 45, "M");
        Employee romaWorker = new Employee(6666, "Roma", 77, 10000, 421212, "M");
        Employee yaraWorker = new Employee(5432, "Yaroslava", 25, 1145.8, 88, "F");
        Employee[] actual = new Employee[5];
        actual[0] = grishaWorker;
        actual[1] = roma1Worker;
        actual[2] = romaWorker;
        actual[3] = yaraWorker;
        actual[4] = lyoshaWorker;
        Employee[] expected = {grishaWorker, roma1Worker, romaWorker, yaraWorker, lyoshaWorker};
        Assert.assertArrayEquals(expected, actual);
    }
}
