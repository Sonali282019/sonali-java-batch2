import java.sql.*;
import java.util.*;
class SqlTest1
{
public static void main(String arg[])throws Exception
{
//load driver
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///DB1","root","root");
Statement st= con.createStatement();
ResultSet rs=st.executeQuery("select*from student");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
}
rs.close();
st.close();
con.close();
}
}
