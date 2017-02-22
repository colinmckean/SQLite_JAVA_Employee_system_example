import java.sql.ResultSet;

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

    //"SELECT artists.name, albums.title, albums.genre FROM artists JOIN albums on artists.id = albums.artist_id WHERE artists.id = %d;", this.id);
    public static void all() {
        String sql = "SELECT e.id, e.name, e.salary, d.title FROM employees e JOIN departments d on d.ID = e.department_id;";
        ResultSet rs = SqlRunner.executeQuery(sql);
        try {
            while (rs.next()) {
              int id = rs.getInt("ID");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                String department = rs.getString("title");
                System.out.print(id + ": ");
                System.out.print("Employee Name: " + name);
                System.out.print("  Salary: " + salary);
                System.out.println("  Department: " + department);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);

        } finally {
            SqlRunner.closeConnection();
        }

    }
}