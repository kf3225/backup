import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {

	String name = "";
	String password = "";

	public void select(String name, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM test_table WHERE user_name=? AND password=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectAll() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM test_table";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectByName(String name) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM test_table WHERE user_name=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectByPassword(String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM test_table WHERE password=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateUserNameByUserName(String oldName, String newName) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "UPDATE test_table SET user_name=? WHERE user_name=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newName);
			ps.setString(2, oldName);
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件更新されました");
			}else {
				System.out.println("該当データ無し");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(int user_id, String user_name, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "INSERT INTO test_table VALUES(?, ?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ps.setString(2, user_name);
			ps.setString(3, password);

			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件保存されました");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int user_id, String user_name, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE from test_table WHERE user_id=? AND user_name=? AND password=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ps.setString(2, user_name);
			ps.setString(3, password);

			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件削除しました");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
