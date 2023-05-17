import java.sql.Connection;
import java.sql.Statement;
import java.util.Random;

public class Demo7_Statement {
    public static void main(String[] args) {
// 声明对象
        Connection connection = null;
        Statement statement = null;
        try {
            // 注册驱动 获取连接
            connection = JdbcUtils.getConnection();
            // 获取Statement对象
            statement = connection.createStatement();
            // 添加批处理列表
            for (int i = 0; i < 100; i++) {
                String sql="insert into person values(null,'张某某','"+new Random().nextInt(50)+"')";
                statement.addBatch(sql);
            }
            //执行批处理列表
            int[] ints = statement.executeBatch();
            for (int anInt : ints) {
                System.out.println(anInt);
            }
            //清空批处理列表
             statement.clearBatch();
            System.out.println(ints.length);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 释放资源
            JdbcUtils.close(statement, connection);
        }
    }
}
