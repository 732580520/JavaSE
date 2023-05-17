import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo4_Exception {
    public static void main(String[] args) throws Exception {
        Connection connection = JdbcUtils.getConnection();
        // 获取发送SQL语句对象
        Statement statement = connection.createStatement();
        // 发送SQL语句
        String sql="select * from person";
        ResultSet resultSet = statement.executeQuery(sql);
        // 遍历结果集
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        JdbcUtils.close(resultSet,statement,connection);

    }
}
