import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo11_C3P0 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // 注册驱动 创建连接池对象
            DataSource ds = new ComboPooledDataSource();
            connection = ds.getConnection();
            statement = connection.createStatement();
            String sql="select * from account";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(resultSet, statement, connection);
        }

    }
}
