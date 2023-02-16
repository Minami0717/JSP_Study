package friend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReplyDao {
	private static ReplyDao instance;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	String driver = "com.mysql.cj.jdbc.Driver";
	String user = "root";
	String pass = "1111";
	String dbURL = "jdbc:mysql://localhost:3306/friend";
	
	private ReplyDao() {
		try {
			Class.forName(driver);
			System.out.println("MySQL 드라이버 검색 성공...");
			
			conn = DriverManager.getConnection(dbURL, user, pass);
			System.out.println("MySQL 연결 성공...\n");
		}
		catch (ClassNotFoundException e) {
			System.out.println("MySQL 드라이버 검색 오류");
		}
		catch (SQLException e) {
			System.out.println("MySQL 연결 객체 생성 실패" + e);
		}
	}
	
	public static ReplyDao getInstance() {
		if (instance == null)
			instance = new ReplyDao();
		return instance;
	}
	
	public List<Reply> selectAll() {
		List<Reply> list = new ArrayList<Reply>();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM reply");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Reply reply = new Reply();
				reply.setIndex(rs.getInt("replyindex"));
				reply.setNickname(rs.getString("nickname"));
				reply.setContents(rs.getString("contents"));
				reply.setPost_idx(rs.getInt("post_idx"));
				reply.setDate(rs.getString("date"));
				list.add(reply);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int insert(Reply reply) {
		int result = 0;
		try {
			pstmt = conn.prepareStatement("insert into reply(nickname,contents,post_idx,date) values(?,?,?,?)");
			pstmt.setString(1, reply.getNickname());
			pstmt.setString(2, reply.getContents());
			pstmt.setInt(3, reply.getPost_idx());
			pstmt.setString(4, reply.getDate());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
