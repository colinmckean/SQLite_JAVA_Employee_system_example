/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
//
//
//        Department.deleteAll();
//        Employee.deleteAll();
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department sales = new Department("Sales");
        Department finance = new Department("Finance");
        Department admin = new Department("Admin");
        JobRole description = new JobRole("Manager");
        JobRole description1 = new JobRole("cleaner");
        JobRole description2 = new JobRole("queen bee");
        JobRole description3 = new JobRole("worker bee");
        JobRole description4 = new JobRole("honey bee");
        description.save();
        description1.save();
        description2.save();
        description3.save();
        description4.save();



        department1.save();
        department2.save();
        sales.save();
        admin.save();
        finance.save();
//        Department.all();
//        finance.setTitle("Money People");
//        finance.update();
//        Department.all();

//        admin.delete();
//        Department.deleteById(21);
//        Department.all();
//
        Employee employee1 = new Employee("Suzie Smith", department1, 45000, description);
        Employee employee2 = new Employee("Jamie Jones", department1, 25020, description1);
        Employee employee3 = new Employee("Emma Smith", department2, 45001, description2);
        Employee employee4 = new Employee("Olivia James", department2, 25005, description3);
        Employee employee5 = new Employee("Sophia Ethan", sales, 45009, description3);
        Employee employee6 = new Employee("Ava William", sales, 25006, description3);
        Employee employee7 = new Employee("Isabella Jacob", finance, 45000, description4);
        Employee employee8 = new Employee("Mia Mason", finance, 25000, description4);
        Employee employee9 = new Employee("Abigail Liam", admin, 45000, description);
        Employee employee10 = new Employee("Emily Noah", admin, 25000, description);
        employee1.save();
        employee2.save();
        employee3.save();
        employee4.save();
        employee5.save();
        employee6.save();
        employee7.save();
        employee8.save();
        employee9.save();
        employee10.save();
//employee5.setName("Steve Rodgers");
//employee5.setSalary(12345.00);
//employee5.setDepartment(finance);
//employee5.update();
//        Employee.all();
//        employee9.delete();
//Employee.deleteById(14);
//        Department.all();
        System.out.println("************************************");
        System.out.println("Printing out all departments:");
        System.out.println("************************************");
        Department.all();
        System.out.println("\n************************************");
        System.out.println("Printing out all employees:");
        System.out.println("************************************");
        Employee.all();
        System.out.println("\n************************************");
        System.out.println("Printing out employee by ID: 10");
        System.out.println("************************************");
        Employee.viewEmployeeById(10);
        System.out.println("\n************************************");
        System.out.println("Printing out employee by name: Emma Smith");
        System.out.println("************************************");
        Employee.viewEmployeeByName("Emma Smith");
        System.out.println("\n************************************");
        System.out.println("get results of department: Admin");
        System.out.println("************************************");
        Department.viewDepartmentByTitle("Admin");
        System.out.println("\n************************************");
        System.out.println("View Department by name:Mia Mason");
        System.out.println("************************************");
        Employee.findDeptByName("Mia Mason");
        System.out.println("************************************");



    }
}
