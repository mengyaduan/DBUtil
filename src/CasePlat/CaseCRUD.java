package CasePlat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Duan on 2017/11/7.
 */
public class CaseCRUD {

    public static void main(String[] args) throws SQLException {
//        read();
//        create();
//        update();
//        delete();
        String a = get_package_id("");
        System.out.println(a);
    }

    static void create() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "";//"insert into package_info(package_name,package_classNum,create_time) values ('d','1987-01-01','400')";
            int i = st.executeUpdate(sql);
            System.out.println("i = " + i);
        } finally {
            JdbcUtils.free(rs, st, conn);
        }
    }

    static void create(String package_name, String package_classNum) throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String ts = String.valueOf(System.currentTimeMillis() / 1000);
            Date now = new Date();
            DateFormat d2 = DateFormat.getDateTimeInstance();//格式化后的时间格式：2016-2-19 20:54:53
            String today = d2.format(now);

            String sql = "insert into package_info(package_name,package_classNum,create_time) values " +
                    "('" + package_name + "','" + package_classNum + "','" + today + "')";
            int i = st.executeUpdate(sql);
            System.out.println("successful : " + i);
        } finally {
            JdbcUtils.free(rs, st, conn);
        }
    }

    static void read() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT id,name,birthday,money FROM user");
            while (rs.next()) {
                System.out.println(rs.getObject("id") + "\t"
                        + rs.getObject("name") + "\t"
                        + rs.getObject("birthday") + "\t"
                        + rs.getObject("money"));
            }
        } finally {
            JdbcUtils.free(rs, st, conn);
        }
    }

    static void update() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "update user set money=money+10";
            int i = st.executeUpdate(sql);
            System.out.println("i = " + i);
        } finally {
            JdbcUtils.free(rs, st, conn);
        }
    }

    static void delete() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "delete from user where id>3";
            int i = st.executeUpdate(sql);
            System.out.println("i = " + i);
        } finally {
            JdbcUtils.free(rs, st, conn);
        }
    }

    static String get_package_id(String package_name) throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String mm;
        String package_name1 = "com.autonavi.test.framework.aos.boss.order.car.callback";
        try {
            conn = JdbcUtils.getConnection();
            String sql = "SELECT id FROM package_info WHERE package_name='" + package_name1 + "';";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery(sql);
            rs.next();
            mm = String.valueOf(rs.getInt("id"));
            while (rs.next()) {
                System.out.println(rs);
            }
        } finally {
            JdbcUtils.free(rs, st, conn);
        }
        return mm;

    }


}
