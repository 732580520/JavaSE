import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo3_ResultSet {
    public static void main(String[] args) throws Exception {
        // 注册驱动 获取连接
        Connection connection = JdbcUtils.getConnection();
        // 获取发送SQL语句对象
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        // 发送SQL语句
        String sql = "select * from person";
        ResultSet resultSet = statement.executeQuery(sql);
        // 遍历结果集
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        System.out.println("==============滚动结果集==============");
        while (resultSet.next()) {
System.out.println(resultSet.getString("name"));
            // 修改数据
            resultSet.updateInt("age",16);
            resultSet.updateRow();
        }
        JdbcUtils.close(resultSet,statement,connection);

    }
}
