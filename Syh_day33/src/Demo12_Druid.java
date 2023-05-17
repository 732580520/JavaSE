import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo12_Druid {
    public static void main(String[] args) {
        // 声明对象
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DruidUtils.getConnection();
            String sql="select * from account where name = ?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"a");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("money"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 释放资源
            DruidUtils.close(resultSet, preparedStatement, connection);
        }
    }
}
