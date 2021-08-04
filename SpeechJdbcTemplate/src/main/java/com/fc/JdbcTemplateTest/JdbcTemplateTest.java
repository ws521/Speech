package com.fc.JdbcTemplateTest;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.fc.HashMapThread.HashMapThreadTest;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.LinkedHashMap;
import java.util.Properties;

// No DataSource set:未设置数据源
public class JdbcTemplateTest {

    @Test
    public void testJdbcTemplateNoParameters() {
        //传建一个JdbcTemplate对象，调用无参方法
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        //输出获取到的对象
        System.out.println(jdbcTemplate);

    }

    @Test
    public void testJdbcTemplateNoParametersUpdate() {
        //传建一个JdbcTemplate对象，调用无参方法
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        //调用jdbcTemplate的update方法
        int affectedRows = jdbcTemplate.update("update update user set username=? where id=?", "张三", 1);


        //输出受影响的行数
        System.out.println(affectedRows);

//        //调用jdbcTemplate的query(查询所有)方法
//        List<Object> query = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<>());
//
//       //输出结果
//        System.out.println(query);
    }
    /*数据源DataSource
     DataSource基本概念
     SUN公司提供了javax.sql.DataSource接口，它负责建立与数据库的连接，
     当在应用程序中访问数据库时必须编写连接数据库的代码，直接引用DataSource
     获取数据库的连接对象即可。用于获取操作数据connection对象
     */

    @Test
    public void testJdbcTemplateParametricStructureDruidDataSourceNull() {
        //创建DataSource 类型的属性 但不指明指向
        DataSource dataSource=null;

        try {
            //调用JdbcTemplate有参构造 传入DataSource
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

            //调用jdbcTemplate的update方法
            int affectedRows = jdbcTemplate.update("update update user set username=? where id=?", "张三", 1);

            //输出受影响的行数
            System.out.println(affectedRows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testJdbcTemplateParametricStructureDruidDataSourceNotNullNoParameters () {
        try {
            //调用JdbcTemplate有参构造 传入DataSource
            JdbcTemplate jdbcTemplate = new JdbcTemplate(new DruidDataSource());

            //调用jdbcTemplate的update方法
            int affectedRows = jdbcTemplate.update("update update user set username=? where id=?", "张三", 1);

            //输出受影响的行数
            System.out.println(affectedRows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testJdbcTemplateParametricStructureDruidDataSourceNotNull() {
        Properties properties = new Properties();
        properties.setProperty("driverClassName","com.mysql.jdbc.Driver");
        properties.setProperty("url","jdbc:mysql://localhost:3308/maven?useSSL=false&useUnicode=true");
        properties.setProperty("username","root");
        properties.setProperty("password","148521");
        try {
            //通过工厂获取DataSource
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

            //调用JdbcTemplate有参构造 传入DataSource
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

            //调用jdbcTemplate的update方法
            int affectedRows = jdbcTemplate.update("update  user set username=? where id=?", "杨幂", 1);

            //输出受影响的行数
            System.out.println("受影响的行数:"+affectedRows);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /*
    * jdbcTemplate是Spring为传统jdbc API 进行封装，
    * 让我们对数据库的数据进行增删改查更加灵活和简单JdbcTemplate是Spring的一部分。
    * JdbcTemplate处理了资源的建立和释放。他帮助我们避免一些常见的错误，比如忘了总要关闭连接。
    * 他运行核心的JDBC工作流，如Statement的建立和执行，而我们只需要提供SQL语句和提取结果。
    * 但和ORM框架相比jdbcTemplate功能就显得里的力不从心了，
    * 学习jdbcTemplate是为学习ORM(对象关系映射)框架做铺垫
    *
    * */


}
