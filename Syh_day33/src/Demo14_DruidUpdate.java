import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo14_DruidUpdate {
    public static void main(String[] args) {
        // 声明对象
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DruidUtils.getConnection();
            String sql="update account set money = money+1000000 where name = ?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"syh");
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
