/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
//
//
//        Department.deleteAll();
//        Employee.deleteAll();
//        Department department1 = new Department("HR");
//        Department department2 = new Department("Marketing");
//        Department sales = new Department("Sales");
//        Department finance = new Department("Finance");
Department admin = new Department("Admin");
//        department1.save();
//        department2.save();
//        sales.save();
admin.save();
//        finance.save();
//        Department.all();
//        finance.setTitle("Money People");
//        finance.update();
//        Department.all();

//        admin.delete();
//        Department.deleteById(21);
//        Department.all();
//
//        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
//        Employee employee2 = new Employee("Jamie Jones", department1, 25000);
//        Employee employee3 = new Employee("Suzie Smith", department2, 45000);
//        Employee employee4 = new Employee("Jamie Jones", department2, 25000);
//        Employee employee5 = new Employee("Suzie Smith", sales, 45000);
//        Employee employee6 = new Employee("Jamie Jones", sales, 25000);
//        Employee employee7 = new Employee("Suzie Smith", finance, 45000);
//        Employee employee8 = new Employee("Jamie Jones", finance, 25000);
//        Employee employee9 = new Employee("Suzie Smith", admin, 45000);
Employee employee10 = new Employee("Wally", admin, 25000);
//        employee1.save();
//        employee2.save();
//        employee3.save();
//        employee4.save();
//        employee5.save();
//        employee6.save();
//        employee7.save();
//        employee8.save();
//        employee9.save();
employee10.save();
//employee5.setName("Steve Rodgers");
//employee5.setSalary(12345.00);
//employee5.setDepartment(finance);
//employee5.update();
//        Employee.all();
//        employee9.delete();
//Employee.deleteById(14);
//        Employee.all();
        Employee.viewEmployeeById(24);
        Employee.viewEmployeeByName("Wally");
        Department.viewDepartmentByTitle("Admin");
        Employee.findDeptByName("Jamie Jones");



    }
}
