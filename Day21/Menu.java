import java.sql.*;
import java.io.*;
class Menu
{
static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
Connection con;
PreparedStatement ps;
Statement st;
ResultSet rs;
Menu() throws Exception
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:dsn");
if(con==null)
{
System.out.println("Connection Failed....");
System.exit(1);
}
}
void insert()throws Exception
{
System.out.print("Enter Roll no :");
int rno=Integer.parseInt(br.readLine());
System.out.print("Enter Name :");
String name=br.readLine();
System.out.print("Enter Percentage :");
float per=Float.parseFloat(br.readLine());
String sql="insert into student values(?,?,?)";
ps=con.prepareStatement(sql);
ps.setInt(1,rno);
ps.setString(2,name);
ps.setFloat(3,per);
int n=ps.executeUpdate();
if(n>0)
System.out.println("Record Inserted...");
}
void modify()throws Exception
{
System.out.print("Enter Roll no to be updated:");
int rno=Integer.parseInt(br.readLine());
System.out.print("Enter new Percentage :");
float per=Float.parseFloat(br.readLine());
String sql="update student set per=? where rno=?";
ps=con.prepareStatement(sql);
ps.setFloat(1,per);
ps.setInt(2,rno);
int n=ps.executeUpdate();
if(n>0)
System.out.println("Record Updated...");
}
void delete()throws Exception
{
System.out.println("Enter Roll No to be deleted :");
int rno=Integer.parseInt(br.readLine());
String sql="delete from student where rno=?";
ps=con.prepareStatement(sql);
ps.setInt(1,rno);
int n=ps.executeUpdate();
if(n>0)
System.out.println("Record Deleted...");
}
void search()throws Exception
{
System.out.println("Enter Roll No :");
int rno=Integer.parseInt(br.readLine());
String searchsql="select * from student where rno=?";
ps=con.prepareStatement(searchsql);
ps.setInt(1,rno);
rs=ps.executeQuery();
if(rs.next())
{
System.out.println("Roll No :"+rs.getInt(1) +"\nName :"+rs.getString(2) +"\nPercentage :"+rs.getFloat(3));
}
else
System.out.println("Roll no not found...");
}
void viewAll()throws Exception
{
String sql="select * from student";
st=con.createStatement();
rs=st.executeQuery(sql);
System.out.println("Roll No\t Name \t Percentage");
while(rs.next())
{
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));

}
}
public static void main(String a[]) throws Exception
{
Menuob = new Menu();
int ch;
do
{
System.out.println(" 1.Insert\n 2.Modify \n 3.Delete \n 4.Search \n 5.view All \n 0.Exit");
System.out.println("Enter your choice : ");
ch = Integer.parseInt(br.readLine());
switch(ch)
{
case 1 :ob.insert();
break;
case 2 : ob.modify();
break;
case 3 : ob.delete();
break;
case 4 : ob.search();
break;
case 5 : ob.viewAll();
break;
case 0 : break;
}
}while(ch!=0);
}
}