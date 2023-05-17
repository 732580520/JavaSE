import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo13_DruidInsert {
    public static void main(String[] args) {
        // 声明对象
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DruidUtils.getConnection();
            String sql="insert into account values (null,?,?)";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"syh");
            preparedStatement.setDouble(2,1000000);
            int count = preparedStatement.executeUpdate();
            System.out.println("count = " + count);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 释放资源
            DruidUtils.close(resultSet, preparedStatement, connection);
        }
    }
}
