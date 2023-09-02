package db;

public class ConnectionFactory {
    public DBConnection getConnection() {
        return new DBConnection();
    }
}
