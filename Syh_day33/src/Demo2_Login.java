import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo2_Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1.提示用户输入用户名和密码
        System.out.println("请输入用户名：");
        String username = input.nextLine();
        System.out.println("请输入密码：");
        String password = input.nextLine();
        // 2.调用方法
        boolean login = checkLogin(username, password);
        // 3.判断结果
        System.out.println(login ? "登录成功" : "登录失败");
    }
    private static boolean checkLogin(String username, String password){
        Connection connection=null;
        PreparedStatement prepareStatement=null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?";
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, username);
            prepareStatement.setString(2, password);
            System.out.println(sql);
            resultSet = prepareStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.close(resultSet, prepareStatement, connection);
        }
        return false;
    }
}
