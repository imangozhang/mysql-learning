package zbh.combat.mysql.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL="jdbc:mysql:///learning?useSSL=false";
    private static final String NAME="root";
    private static final String PASSWORD="Imango@0603";

    private static Connection conn=null;

    // 静态代码块：加载驱动、连接数据库
    static{
        try {
            // 1.加载驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.获得数据库的连接
            conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    // 对外提供一个方法来获取数据库连接
    public static Connection getConnection(){
        return conn;
    }

    /*public static void main(String[] args) throws Exception{
        // 3.通过数据库的连接操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select name, price from pms_product");
        while(rs.next()){
            // 如果对象中有数据，就会循环打印出来
            System.out.println(rs.getString("name")+": "+rs.getInt("price"));
        }
    }*/
}
