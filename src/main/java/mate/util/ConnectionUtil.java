package mate.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    public static final String JDBC_DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
    public static final String JDBC_CONNECTION_PATH
            = "jdbc:mysql://remotemysql.com:3306/QaXsMwcmEG"; //change DB name
    public static final String PASSWORD = ""; //INSERT PASSWORD
    public static final String LOGIN = ""; //INSERT LOGIN

    static {
        try {
            Class.forName(JDBC_DRIVER_PATH);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't create DB drive for mySql" + JDBC_DRIVER_PATH, e);
        }
    }

    public static Connection getConnection() {
        try {
            Properties dbProperties = new Properties();
            dbProperties.put("user", LOGIN);
            dbProperties.put("password", PASSWORD);
            return DriverManager
                    .getConnection(JDBC_CONNECTION_PATH, dbProperties);
        } catch (SQLException throwables) {
            throw new RuntimeException("Can't "
                    + "create connection to DB in DriverManager", throwables);
        }
    }
}
