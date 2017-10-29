// jdbc使用过程演示

import java.sql.*;

public class Base {
    static void test() throws SQLException {
        // 注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String name = "root";
        String password = "password";
        // 建立连接
        Connection conn = DriverManager.getConnection(url, name, password);

        // 创建语句
        Statement st = conn.createStatement();

        // 执行语句
        ResultSet rs = st.executeQuery("SELECT * FROM user");

        // 处理结果
        while (rs.next()) {
            System.out.println(rs.getObject(1) + "\t" + rs.getObject(2) + "\t"
                    + rs.getObject(3) + "\t" + rs.getObject(4));
        }

        // 释放资源
        rs.close();
        st.close();
        conn.close();

    }
}
