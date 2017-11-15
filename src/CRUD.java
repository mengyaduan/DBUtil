import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Duan on 2017/11/7.
 */
public class CRUD {

    public static void main(String[] args) throws SQLException {
//        read();
//        create();
//        update();
//        delete();
        read();
    }

    static void create() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "insert into user(name,birthday,money) values ('name1','1987-01-01','400')";
            int i = st.executeUpdate(sql);
            System.out.println("i = " + i);
        } finally {
            JdbcUtils.free(rs, st, conn);
        }
    }

    static void create(String casename, String totalcase) throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "insert into user(name,birthday,money) values " +
                    "('"+ casename +"','1987-01-01','"+totalcase+"')";
            int i = st.executeUpdate(sql);
            System.out.println("i = " + i);
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

}
