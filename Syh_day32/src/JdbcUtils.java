import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
    // 创建属性集对象
    private static final Properties prop = new Properties();
    // 注册驱动
    static {
        // 注册驱动
        try {
            prop.load(new FileReader("jdbc.properties"));
            String driverClass = prop.getProperty("driverClass");
            Class.forName(driverClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 获取连接
    public static Connection getConnection() throws Exception {
        String urlName = prop.getProperty("urlName");
        String userName = prop.getProperty("userName");
        String passwordName = prop.getProperty("passwordName");
        Connection connection = DriverManager.getConnection(urlName, userName, passwordName);
        return connection;
    }
    // 释放资源
    public static void close(AutoCloseable... acs) {
        for (AutoCloseable ac : acs) {
            if (ac != null) {
                try {
                    ac.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
