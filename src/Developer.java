import java.util.*;

public class Developer extends Employee {

    Random random = new Random();

    private int fixedBugs;

    public Developer(long id, String name, int age, double salary, String gender, int fixedBugs) {
        super(id, name, age, salary, gender);
        this.fixedBugs = fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + fixedBugs * 2.50 * (random.nextBoolean() ? 2 : 0);
    }

    @Override
    public String toString() {
        return "DEVELOPER" +
                "\n____________________________" +
                super.toString() +
                "\n Bugs Fixed: " + fixedBugs +
                "\n";
    }
}
