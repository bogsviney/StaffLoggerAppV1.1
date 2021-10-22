import java.math.*;
import java.util.*;

public class EmployeeFactory {
    private final static String[] MALE_NAMES = {
            "Tolik",
            "Grisha",
            "Alexander",
            "Igor",
            "Nazar",
            "Petro",
            "Mykola",
            "Ostap"
    };
    private final static String[] FEMALE_NAMES = {
            "Alla",
            "Irina",
            "Valentina",
            "Olya",
            "Elena",
            "Tanya",
            "Ivanka",
            "Natasha"
    };

    private final static String[] GENDER = {

            "MALE",
            "FEEMALE"
    };

    private final static String[] POSITION = {
            "DESIGNER",
            "MANAGER",
            "DEVELOPER"
    };

    private final static int AGE_LOWER_BOUND = 21;
    private final static int AGE_UPPER_BOUND = 65;
    private final static int SALARY_LOWER_BOUND = 700;
    private final static int SALARY_UPPER_BOUND = 10000;

    Random random = new Random();

    Employee[] getRandomEmployees(int size) {
        Employee[] randomEmployees = new Employee[size];
        for (int i = 0; i < size; i++) {
            long id = i + 1;
            int age = random.nextInt(AGE_UPPER_BOUND - AGE_LOWER_BOUND) + AGE_LOWER_BOUND;
            double salary = new BigDecimal(random.nextDouble() * SALARY_UPPER_BOUND + SALARY_LOWER_BOUND).setScale(2, RoundingMode.HALF_UP).doubleValue();
            int fixedBugs = random.nextInt(500) + 1;
            double rate = new BigDecimal(random.nextDouble() * 1 + 25).setScale(2, RoundingMode.HALF_UP).doubleValue();
            String gender = GENDER[random.nextInt(GENDER.length)];
            int workedDays = random.nextInt(23);
            String name = gender.equals("MALE") ? MALE_NAMES[random.nextInt(MALE_NAMES.length)] : FEMALE_NAMES[random.nextInt(FEMALE_NAMES.length)];
            String spawnRandomPosition = POSITION[random.nextInt(POSITION.length)];
            switch (spawnRandomPosition) {
                case "MANAGER":
                    randomEmployees[i] = new Manager(id, name, age, salary, gender);
                    break;
                case "DESIGNER":
                    randomEmployees[i] = new Designer(id, name, age, salary, gender, rate, workedDays);
                    break;
                case "DEVELOPER":
                    randomEmployees[i] = new Developer(id, name, age, salary, gender, fixedBugs);
                    break;
            }
        }
        return randomEmployees;
    }


    Employee[] getDefaultEmployees() {

        Employee grishaWorker = new Employee(1212, "Grisha", 33, 1200.0, 100,  "M");
        Employee lyoshaWorker = new Employee(6617, "Lyosha", 21, 955.0, 56,  "M");
        Employee roma1Worker = new Employee(2314, "Roma", 22, 945.8, 45,  "M");
        Employee romaWorker = new Employee(6666, "Roma", 77, 10000, 421212, "M");
        Employee yaraWorker = new Employee(5432, "Yaroslava", 25, 1145.8, 88,  "F");

        Employee[] defaultEmployees = new Employee[5];
        defaultEmployees[0] = grishaWorker;
        defaultEmployees[1] = roma1Worker;
        defaultEmployees[2] = romaWorker;
        defaultEmployees[3] = yaraWorker;
        defaultEmployees[4] = lyoshaWorker;

        return defaultEmployees;

    }

}







