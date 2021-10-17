public class Designer extends Employee {
    private int workedDays;
    private double rate;

    Designer(long id, String name, int age, double salary, String gender, double rate, int workedDays) {
        super(id, name, age, salary, gender);
        this.rate = rate;
        this.workedDays = workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + rate * workedDays;
    }

    @Override
    public String toString() {
        return "DESIGNER" +
                "\n____________________________" +
                super.toString() +
                "\n Working days in this month: " + workedDays +
                ",\n rate per day: " + rate + "$" +
                "\n";
    }
}
