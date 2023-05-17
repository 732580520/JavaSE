import java.sql.Connection;
import java.sql.PreparedStatement;

public class Demo3_Insert {
    public static void main(String[] args) {
        //声明对象
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection=JdbcUtils.getConnection();
            String sql = "insert into person values(null,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            //?号赋值
            preparedStatement.setString(1,"大朗");
            preparedStatement.setInt(2, 18);
            //执行SQL 返回结果
            int count = preparedStatement.executeUpdate();
            //处理结果
            System.out.println("count = " + count);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.close(preparedStatement, connection);
        }

    }
}
