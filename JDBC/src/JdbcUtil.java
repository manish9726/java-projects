import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class JdbcUtil {

	public final static Connection getConnection() throws SQLException {

		Properties p = new Properties();
		try {
			p.load(new FileReader("src/database.info"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// String driver = "oracle.jdbc.OracleDriver";

		Connection conn = null;

		try {
			Class.forName(p.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("pass"));

		return conn;

	}
}
