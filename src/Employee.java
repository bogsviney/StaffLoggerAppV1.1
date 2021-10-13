public class Employee {
    String ANSI_GREEN = "\u001B[32m";
    long id;
    String name;
    int age;
    double salary;
    String gender;
    int fixedBugs;
    double defaultBugRate;

    Employee(){
        System.out.println(ANSI_GREEN +"================================= WARNING: EMPLOYEE spawning is started! ===========================================");
    }

    Employee(int id, String name, int age, double salary, int fixedBugs, double defaultBugRate, String gender) {
        System.out.println(ANSI_GREEN +"================================= WARNING: EMPLOYEE spawning is started! ===========================================");
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
        this.gender = gender;
    }
 }
