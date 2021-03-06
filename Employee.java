import java.sql.ResultSet;

import db.SqlRunner;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Department department;
    private JobRole description;

    public Employee(String name, Department department, double salary, JobRole description) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.description = description;
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
        int descriptionId = description.getId();
        String sql = String.format("INSERT INTO employees(name, salary, department_id, description_id) VALUES ('%s',%7.2f, %d, %d);", this.name, this.salary, departmentId, descriptionId);
        this.id = SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public static void deleteAll() {
        String sql = "DELETE FROM employees;";
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public static void all() {
        String sql =
                "SELECT e.id, e.name, e.salary, d.title, j.description FROM employees e JOIN departments d on d.ID = e.department_id JOIN descriptions j on j.ID = e.description_id;";
        ResultSet rs = SqlRunner.executeQuery(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                String department = rs.getString("title");
                String description = rs.getString("description");
                System.out.print(id + ": ");
                System.out.print("Employee Name: " + name);
                System.out.print("  Salary: " + salary);
                System.out.print("  Job: " + description);
                System.out.println("  Department: " + department);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);

        } finally {
            SqlRunner.closeConnection();
        }


    }

    public void update() {
        String sql = String.format("UPDATE employees SET name = '%s', salary = %7.2f, department_id = %d WHERE id = %d;", this.name, this.salary, this.department.getId(), this.id);
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }

    public static void deleteById(int id) {
        String sql = String.format("DELETE FROM employees WHERE id = %d;", id);
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();

    }

    public void delete() {
        String sql = String.format("DELETE FROM employees WHERE id = %d;", this.id);
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public static void viewEmployeeById(int idToFind) {
        String sql = String.format(
                "SELECT e.id, e.name, e.salary, d.title, j.description FROM employees e LEFT JOIN departments d on d.ID = e.department_id LEFT JOIN descriptions j on j.ID = e.description_id WHERE e.id = %d;", idToFind);
        ResultSet rs = SqlRunner.executeQuery(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                String description = rs.getString("description");
                String department = rs.getString("title");
                System.out.print(id + ": ");
                System.out.print("Employee Name: " + name);
                System.out.print("  Salary: " + salary);
                System.out.print("  Job: " + description);
                System.out.println("  Department: " + department);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);

        } finally {
            SqlRunner.closeConnection();
        }


    }

    public static void viewEmployeeByName(String nameToFind) {
        String sql = String.format(
                "SELECT e.id, e.name, e.salary, d.title, j.description FROM employees e LEFT JOIN departments d on d.ID = e.department_id LEFT JOIN descriptions j on j.ID = e.description_id WHERE e.name = '%s';", nameToFind);
        ResultSet rs = SqlRunner.executeQuery(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                String department = rs.getString("title");
                String description = rs.getString("description");
                System.out.print(id + ": ");
                System.out.print("Employee Name: " + name);
                System.out.print("  Salary: " + salary);
                System.out.print("  Job: " + description);
                System.out.println("  Department: " + department);

            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);

        } finally {
            SqlRunner.closeConnection();
        }
    }

    public static void findDeptByName(String nameToFind) {
        String sql = String.format(
                "SELECT e.id, e.name, d.title FROM employees e JOIN departments d on d.ID = e.department_id WHERE e.name = '%s';", nameToFind);
        ResultSet rs = SqlRunner.executeQuery(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                String department = rs.getString("title");
                System.out.print(id + ": ");
                System.out.println(name + " works in " + department);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);

        } finally {
            SqlRunner.closeConnection();
        }

    }


}