import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class Demo2_JdbcApi {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileReader("jdbc.properties"));
        String driverClass = prop.getProperty("driverClass");
        Class.forName(driverClass);
        String url = prop.getProperty("url");
        String user = prop.getProperty("user");
        String password = prop.getProperty("password");
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql="select * from person";
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<Person> list = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            Person person = new Person(id,name, age);
            list.add(person);
        }
        list.forEach(person -> System.out.println(person));
        resultSet.close();
        statement.close();
        connection.close();
    }
}
