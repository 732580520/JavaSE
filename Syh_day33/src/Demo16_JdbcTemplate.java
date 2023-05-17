import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

public class Demo16_JdbcTemplate {
   private JdbcTemplate jdbcTemplate=new JdbcTemplate(DruidUtils.getDs());
    public void insert(){
        String sql="insert into account values(null,?,?)";
        int count=jdbcTemplate.update(sql,"SYH",1.25);
        System.out.println("count = " + count);
    }
    public void update(){
        String sql="update account set money = 0.25 where name = ?";
        jdbcTemplate.update(sql,"SYH");
    }
    public void delete(){
        String sql="delete from account where name = ?";
        jdbcTemplate.update(sql,"SYH");
    }
    public void query1(){
        String sql="select * from account where id = ?";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql, 1);
        System.out.println("stringObjectMap = " + stringObjectMap);
    }
    public void query2(){
        String sql="select * from account";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println("map = " + map);
        }

    }
    public void query3(){
        String sql="select count(name) from person";
        Integer integer = jdbcTemplate.queryForObject(sql, int.class);
        System.out.println("integer = " + integer);
    }
}
