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

    private final static int AGE_LOWER_BOUND = 21;
    private final static int AGE_UPPER_BOUND = 65;
    private final static int SALARY_LOWER_BOUND = 700;
    private final static int SALARY_UPPER_BOUND = 1000;

    Employee[] getRandomEmployees(int size) {
        Random random = new Random();
        Employee[] randomEmployees = new Employee[size];
        for (int i = 0; i < size; i++) {
            Employee employee = new Employee();
            employee.setId(i + 1);
            employee.setAge(random.nextInt(AGE_UPPER_BOUND) + AGE_LOWER_BOUND);
            employee.setSalary(new BigDecimal(random.nextDouble() * SALARY_UPPER_BOUND + SALARY_LOWER_BOUND).setScale(2, RoundingMode.HALF_UP).doubleValue());
            employee.setFixedBugs(random.nextInt(500) + 1);
            employee.setDefaultBugRate(new BigDecimal(random.nextDouble() * 1 + 25).setScale(2, RoundingMode.HALF_UP).doubleValue());
            employee.setGender(GENDER[random.nextInt(GENDER.length)]);
            if (employee.getGender().equals("MALE")) {
                employee.setName(MALE_NAMES[random.nextInt(MALE_NAMES.length)]);
            } else {
                employee.setName(FEMALE_NAMES[random.nextInt(FEMALE_NAMES.length)]);
            }
            randomEmployees[i] = employee;
        }
        return randomEmployees;
    }
}







