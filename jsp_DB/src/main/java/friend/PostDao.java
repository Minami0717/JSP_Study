package friend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostDao {
	private static PostDao instance;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	String driver = "com.mysql.cj.jdbc.Driver";
	String user = "root";
	String pass = "1111";
	String dbURL = "jdbc:mysql://localhost:3306/friend";
	
	private PostDao() {
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
	
	public static PostDao getInstance() {
		if (instance == null)
			instance = new PostDao();
		return instance;
	}
	
	public List<Post> selectAll() {
		List<Post> list = new ArrayList<Post>();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM post");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Post post = new Post();
				post.setIdx(rs.getInt("idx"));
				post.setTitle(rs.getString("title"));
				post.setContent(rs.getString("content"));
				post.setWriter(rs.getString("writer"));
				post.setDate(rs.getString("date"));
				post.setHits(rs.getInt("hits"));
				post.setRecommend(rs.getInt("recommend"));
				post.setPw(rs.getString("pw"));
				list.add(post);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Post select(Integer idx) {
		Post post = new Post();
		try {
			pstmt = conn.prepareStatement("SELECT * FROM post where idx=?");
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				post.setIdx(rs.getInt("idx"));
				post.setTitle(rs.getString("title"));
				post.setContent(rs.getString("content"));
				post.setWriter(rs.getString("writer"));
				post.setDate(rs.getString("date"));
				post.setHits(rs.getInt("hits"));
				post.setRecommend(rs.getInt("recommend"));
				post.setReplyNum(rs.getInt("replyNum"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return post;
	}
	
	public int updateReply(Integer idx) {
		int result = 0;
		try {
			pstmt = conn.prepareStatement("update post set replyNum=replyNum+1 where idx=?");
			pstmt.setInt(1, idx);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int insert(Post post) {
		int result = 0;
		try {
			pstmt = conn.prepareStatement("insert into post(title,content,writer,date,pw) values(?,?,?,?,?)");
			pstmt.setString(1, post.getTitle());
			pstmt.setString(2, post.getContent());
			pstmt.setString(3, post.getWriter());
			pstmt.setString(4, post.getDate());
			pstmt.setString(5, post.getPw());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int update(Post post) {
		int result = 0;
		try {
			pstmt = conn.prepareStatement("update post set hits = ? where idx = ?");
			pstmt.setInt(1, post.getHits());
			pstmt.setInt(2, post.getIdx());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
