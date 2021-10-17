public class Manager extends Employee{

    Manager (long id,String name,int age,double salary,String gender){
        super(id, name, age, salary, gender);

    }

    @Override
    public String toString() {
        return "MANAGER" +
                "\n____________________________" +
                super.toString() +
                "\n";
    }
}
