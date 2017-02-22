import db.SqlRunner;

/**
 * Created by user on 22/02/2017.
 */
public class JobRole {
    private int id;
    private String description;
    public JobRole(String description) {
        this.description = description;
    }
    public void save() {
        String sql = String.format("INSERT INTO descriptions(description) VALUES ('%s');", this.description);
        this.id = SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public int getId() {
        return id;
    }
}
