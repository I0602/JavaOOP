public class Employee extends Person{
    private double salary;


    public Employee() {
    }

    public Employee(String id, String name, int yearOfBirth, double salary) {
        super(id, name, yearOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
            super.toString() + 
            " salary='" + getSalary() + "'" +
            "}";
    }

}