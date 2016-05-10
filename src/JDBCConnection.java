
import java.sql.*;

public class JDBCConnection {

	public static void main(String[] args) {
		try {
			System.out.println("this is code change");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle", "c##anand", "sunil");
			Statement st =conn.createStatement();
			String sql = "select * from jdbcconnection";
			ResultSet re = st.executeQuery(sql);
			while(re.next()){
				System.out.println(re.getString(1));
				
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
			
		} catch (SQLException e) {
			 e.printStackTrace();
		}
		
		
		

	}

}
