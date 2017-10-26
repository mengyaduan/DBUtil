import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUtil {

    private static final String URL="jdbc:mysql://localhost:3306/case_test?useSSL=false";
    private static final String NAME="root";
    private static final String PASSWORD="password";

    public static void main(String[] args) throws Exception{

        String tablename = "cast_test01";
        String mydata = "段亚梦, 测试插入数据, true, BVT, ";

        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得数据库的连接
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查
        Statement stmt = conn.createStatement();

//        String opt = "INSERT INTO" + tablename + "VALUES ("+mydata + System.currentTimeMillis() + ")";
        String sql = "INSERT INTO cast_test01 (name1,desc1,enable1,groups1,createtime1) VALUES " +
                "('段亚梦','插入测试','true','bvt','2017-10-27 00:20:46')";
        int rs = stmt.executeUpdate(String.format(sql));//选择import java.sql.ResultSet;
        System.out.println(rs);
//        while(rs.next()){//如果对象中有数据，就会循环打印出来
//            System.out.println(rs.getString("user_name")+","+rs.getInt("age"));
//        }
    }
}
