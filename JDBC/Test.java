package TestJDBC;

import java.sql.*;

//该类测试数据库的基本连接步骤
public class Test {
    public static void main(String[] args) {
        try {
            //第一步： //加载驱动
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            //从本机SQL Server数据库服务器上的数据库stu的coure表中读取所有课程名中包含有“数据”的课程信息
            //localhost表示本机，也可以是其他计算机的IP，1433表示SQL Server端口号
            String conStr="jdbc:sqlserver://localhost:1433; DatabaseName=stu_Course";
            String usr = "su";  //用户名
            String password = "0";      //密码

            //第二步：创建数据库连接(Connection)对象
            Connection con = DriverManager.getConnection(conStr, usr, password);

            //第三步：用已经创建的数据库连接对象来创建SQL语句执行(Statement)对象
            Statement st = con.createStatement();

            String cname = "ll";
            String strSql = "select * from Course where cname like '%" + cname + "%'";

            //第四步：用已经创建的数据库连接对象来创建SQL语句执行对象
            //得到结果集合
            ResultSet rs = st.executeQuery(strSql);

            //第五步：操作
            while (rs.next()) {
                System.out.println(rs.getString("cno"));
                System.out.println(rs.getString("cname"));
                System.out.println(rs.getInt("credit"));
            }

            //第六步：关闭连接，释放资源
            rs.close();     //关闭结果集合对象
            st.close();     //关闭SQL语句执行对象
            con.close();    //关闭数据库连接对象

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
