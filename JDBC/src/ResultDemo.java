import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		Connection conn = null;
//		String sql = "select * from product";
//
//		try {
//			conn = JdbcUtil.getConnection();
//			ResultSet rs = conn.createStatement().executeQuery(sql);
//			ResultSetMetaData meta = rs.getMetaData();
//			for (int c = 1; c <= meta.getColumnCount(); c++)
//				System.out.print(meta.getColumnName(c) + "\t");
//
//			System.out.println();
//			while (rs.next()) {
//
//				System.out.printf("%-5d\t%-15s\t%15s\n",rs.getInt(1),  rs.getString("name"), rs.getString(3));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//
//			try {
//				if (conn != null)
//
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//
//	}
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=JdbcUtil.getConnection();  
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
		ResultSet rs=stmt.executeQuery("select * from product");  
		  
		//getting the record of 1st row  
		rs.absolute(1);  
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
		  
		con.close();  

	}}
