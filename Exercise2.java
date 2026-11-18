class Employee{
    private final String name;
    protected final double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double calculate_bonus(){
        return salary*0.10;
    }
}

class Manager extends Employee{
    public Manager(String name, double salary){
        super(name, salary);
    }

    @Override 
    public double calculate_bonus(){
        return salary*0.20;
    }
}

class Intern extends Employee{
    public Intern(String name, double salary){
        super(name, salary);
    }

    @Override
    public double calculate_bonus(){
        return salary*0.05;
    }
}

public class Exercise2{
    public static void main(String[] args){
        Employee[] staff = {
            new Employee("Panha", 1000),
            new Manager("Wattana", 1000),
            new Intern("Vuth", 1000)
        };

        for (Employee person : staff ){
            System.out.printf("%s (%s) earns a bonus of %.2f%n",
                person.getName(),
                person.getClass().getSimpleName(),
                person.calculate_bonus());
        }
    }
}