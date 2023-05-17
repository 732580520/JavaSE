import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

/*
    事务回滚点: 事务回滚的位置[标记]。
        Savepoint setSavepoint() 在当前事务中创建一个未命名的保存点，并返回表示它的新的Savepoint对象。
        Savepoint setSavepoint(String name) 在当前事务中创建具有给定名称的保存点，并返回表示它的新的 Savepoint对象。
    java.sql.Interface.Savepoint:一个保存点的表示，这是当前事务中可以从Connection.rollback方法引用的一个点。
        当事务回滚到保存点时，保存点之后所做的所有更改都将被撤销。
 */
public class Demo10_Savepoint {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Savepoint savepoint = null;
        try {
            //注册驱动获取连接
            connection = JdbcUtils.getConnection();
            //开启事务
            connection.setAutoCommit(false);
            savepoint = connection.setSavepoint();
            //获取预编译对象
            String sql = "insert into person values(null,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 1; i <= 10000; i++) {
                preparedStatement.setString(1, "金莲");
                preparedStatement.setInt(2, 18);
                preparedStatement.executeUpdate();
                //异常
                if (i == 527) {
                    System.out.println(i / 0);
                }
                //设置回滚到
                if (i % 1000 == 0) {
                    savepoint = connection.setSavepoint();
                }

            }
            connection.commit();
        } catch (Exception e) {
            try {
                if (connection != null) {
                    connection.rollback(savepoint);
                    connection.commit();
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JdbcUtils.close(preparedStatement, connection);
        }

    }
}
