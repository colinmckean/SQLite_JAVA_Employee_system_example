import db.SqlRunner;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Department department;

    public Employee(String name, Department department, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void save() {
        int departmentId = department.getId();
        String sql = String.format("INSERT INTO employees(name, salary, department_id) VALUES ('%s',%7.2f, %d);", this.name, this.salary, departmentId);
        this.id = SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }
    public static void deleteAll(){
        String sql = "DELETE FROM employees;";
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }
}