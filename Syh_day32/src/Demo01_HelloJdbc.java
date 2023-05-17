import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Demo01_HelloJdbc {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());
            String url = "jdbc:mysql://localhost:3306/sh2303?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, user, password); // 先运行一下
            // 获取发送SQL语句对象
            Statement statement = connection.createStatement();
            // 发送SQL语句，返回结果
            String sql ="select * from person";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                String id=resultSet.getString("id");
                String name=resultSet.getString("name");
                String age=resultSet.getString("age");
                System.out.println(id+".."+name+".."+age);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
