import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class DBObjectPool extends AbstractObjectPool<Connection> {

    private String driverName;
    private String dsn;
    private String username;
    private String password;
    static final public String dbname = "utmdb";

    // ODBC - Object Database Connectivity
    // JDBC - Java Database Connectivity
    // DSN ODBC | JDBC
    public DBObjectPool(String driverName, String dsn, String username, String password, long expired) {
        super(expired);

        try {
            Class.forName(driverName).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.driverName = driverName;
        this.dsn = dsn;
        this.username = username;
        this.password = password;
    }

    @Override
    protected Connection createVeryResourseIntensiveObject() {
        try {
            return DriverManager.getConnection(dsn, username, password); // new
        } catch (SQLTimeoutException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean isUpAndRunning(Connection obj) {
        try {
            return !((Connection) obj).isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void destroy(Connection obj) {
        try {
            ((Connection) obj).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
