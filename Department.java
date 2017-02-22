import db.SqlRunner;

public class Department {
    private int id;
    private String title;

    public Department(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void save() {
       String sql = String.format("INSERT INTO departments(title) VALUES ('%s');", this.title);
        this.id = SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }
    public static  void deleteAll(){
        String sql = "DELETE FROM departments;";
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }
//      Create CRUD functions to save, select all (static), delete all(static),
//      delete one and update for departments and employees. Create Departments Sales,
//      Finance, Admin Add 2 employees to each department.
}