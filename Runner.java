/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
Department.deleteAll();
      Department department1 = new Department("HR");
     Department department2 = new Department("Marketing");
    Department sales = new Department("Sales");
         Department finance = new Department("Finance");
        Department admin = new Department("Admin");
////
department1.save();
        department2.save();
//
sales.save();
admin.save();
        finance.save();
        Department.all();
//        finance.setTitle("Money People");
//        finance.update();
//        Department.all();

        admin.delete();
//        Department.deleteById(21);
        Department.all();
//
//        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
//        Employee employee2 = new Employee("Jamie Jones", department2, 25000);
//
//        employee1.save();
//        employee2.save();

    }
}
