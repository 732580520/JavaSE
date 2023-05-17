import java.sql.Connection;
import java.sql.Statement;

public class Demo5_JdbcCRUD {
    public static void main(String[] args) throws Exception {
        insert();
        //update();
        //delete();
    }
    //添加数据
    public static void insert() throws Exception {
        Connection connection = JdbcUtils.getConnection();
        // 获取发送SQL语句对象
        Statement statement = connection.createStatement();
        // 发送SQL语句
        String sql="insert into person values (null,'大朗',38),(null,'金莲',20),(null,'西门',58)";
        int count = statement.executeUpdate(sql);
        // 处理结果
        System.out.println("count = " + count);
        JdbcUtils.close(statement,connection);
    }
    //修改数据
    public static void update() throws Exception {
        Connection connection = JdbcUtils.getConnection();
        // 获取发送SQL语句对象
        Statement statement = connection.createStatement();
        // 发送SQL语句
        String sql="update person set age = 100 where age = 65";
        int count = statement.executeUpdate(sql);
        // 处理结果
        System.out.println("count = " + count);
        JdbcUtils.close(statement,connection);
    }
    //删除数据
    public static void delete() throws Exception {
        Connection connection = JdbcUtils.getConnection();
        // 获取发送SQL语句对象
        Statement statement = connection.createStatement();
        // 发送SQL语句
        String sql = "delete from person where age = 100";
        int count = statement.executeUpdate(sql);
        // 处理结果
        System.out.println("count = " + count);
        JdbcUtils.close(statement,connection);
    }
}
