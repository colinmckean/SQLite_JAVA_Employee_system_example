import java.sql.ResultSet;

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
    public static void all(){
        String sql = "SELECT * FROM departments;";
        ResultSet rs = SqlRunner.executeQuery(sql);
        try {
            while (rs.next()) {
                String title = rs.getString("title");
                System.out.println(title);
                System.out.println();
            }
        } catch (Exception e){
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);

        }finally {
            SqlRunner.closeConnection();
        }
    }
//      Create CRUD functions to save, select all (static), delete all(static),
//      delete one and update for departments and employees. Create Departments Sales,
//      Finance, Admin Add 2 employees to each department.
}