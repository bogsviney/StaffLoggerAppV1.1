public class Employee {

    String PURPLE = "\u001B[35m";
    private long id;
    private String name;
    private int age;
    private double salary;
    private String gender;
    private double defaultBugRate;

    Employee() {
        System.out.println(PURPLE + "================================= WARNING: EMPLOYEE spawning is started! ===========================================");
    }

    Employee(long id, String name, int age, double salary, int fixedBugs, double defaultBugRate, String gender) {
        System.out.println(PURPLE + "================================= WARNING: EMPLOYEE spawning is started! ===========================================");
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.defaultBugRate = defaultBugRate;
        this.gender = gender;
    }

    public Employee(long id, String name, int age, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public double calculateSalary() {
        return getSalary();
    }

    public String toString() {
        String info =
                "\n id = " + id +
                        ",\n age = " + age +
                        ",\n name = " + name +
                        ",\n salary = " + salary + " $" +
                        ",\n gender: " + gender +
                        "\n ";

        return info;
    }
}
