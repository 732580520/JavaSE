import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DruidUtils {
    private static DataSource ds;
    // 注册驱动 创建连接池对象
    static {
        try {
            Properties prop = new Properties();
            prop.load(new FileReader("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 返回连接池对象的方法
    public static DataSource getDs() {
        return ds;
    }
    // 获取连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
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
