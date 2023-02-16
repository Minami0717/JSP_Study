/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-01-09 00:35:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import friend.ReplyDao;
import friend.Reply;
import friend.PostDao;
import friend.Post;
import java.util.List;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.time.LocalDate");
    _jspx_imports_classes.add("java.time.format.DateTimeFormatter");
    _jspx_imports_classes.add("friend.PostDao");
    _jspx_imports_classes.add("java.time.LocalDateTime");
    _jspx_imports_classes.add("friend.ReplyDao");
    _jspx_imports_classes.add("friend.Reply");
    _jspx_imports_classes.add("friend.Post");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

	request.setCharacterEncoding("utf-8");
	Integer idx = Integer.parseInt(request.getParameter("idx"));
	String nick = request.getParameter("nickname");
	String pw = request.getParameter("pw");
	String text = request.getParameter("text");

	Post post = PostDao.getInstance().select(idx);
	post.setHits(post.getHits()+1);
	PostDao.getInstance().update(post);
	
	if (nick != null) {
		if(nick.isEmpty()) {
			
      out.write("<script>alert(\"닉네임을 입력하세요\"); history.back()</script>");

			return;
		}
		if(pw.isEmpty()) {
			
      out.write("<script>alert(\"비밀번호를 입력하세요\"); history.back()</script>");

			return;
		}
		if(text.isEmpty()) {
			
      out.write("<script>alert(\"댓글을 입력하세요\"); history.back()</script>");

			return;
		}
		
		Reply reply = new Reply();
		reply.setNickname(nick);
		reply.setContents(text);
		reply.setPost_idx(idx);
		String date = LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("MM.dd HH:mm:ss"));
		reply.setDate(date);
		
		ReplyDao.getInstance().insert(reply);
		PostDao.getInstance().updateReply(idx);
		post.setReplyNum(post.getReplyNum()+1);
	}
	
	List<Post> list = PostDao.getInstance().selectAll();
	List<Reply> replies = ReplyDao.getInstance().selectAll();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	body {width: 60%; margin-left: 20%;}\r\n");
      out.write("	h2 {color: #29367c}\r\n");
      out.write("	#post {width: 100%; height: 500px;\r\n");
      out.write("	border-top: 2px solid #3b4890; position: relative;}\r\n");
      out.write("	#head {border-bottom: 1px solid gainsboro; padding: 10px 0 5px 10px;}\r\n");
      out.write("	#sub {font-size: 13px; display: inline-block;}\r\n");
      out.write("	#con {padding: 10px;}\r\n");
      out.write("	table {width: 100%; text-align: center;}\r\n");
      out.write("	th {border-bottom: 1px solid #3b4890; border-top: 2px solid #3b4890;}\r\n");
      out.write("	tr {border: 1px solid black;}\r\n");
      out.write("	/* td {border-bottom: 1px solid gainsboro;} */\r\n");
      out.write("	a {text-decoration: none; color: black;}\r\n");
      out.write("	#rec {border: 1px solid gainsboro; width: 300px;\r\n");
      out.write("	height: 100px; text-align: center; position: absolute;\r\n");
      out.write("	bottom: 50px; left: 35%;}\r\n");
      out.write("	input[type=button] {margin-top: 20px; border-radius: 100px; width: 50px;\r\n");
      out.write("	height: 50px; border: none; color: white; cursor: pointer;}\r\n");
      out.write("	input[value=추천] {background: #3b4890;}\r\n");
      out.write("	input[value=비추] {background: gray;}\r\n");
      out.write("	input[type=text],input[type=password] {height: 30px;}\r\n");
      out.write("	input[type=text] {margin-bottom: 5px;}\r\n");
      out.write("	input[type=submit] {background: #3b4890; color: white; width: 85px; height: 30px;\r\n");
      out.write("	border: none; cursor: pointer; border-radius: 2px;}\r\n");
      out.write("	#comment {border-top: 2px solid #3b4890; padding: 10px; clear: both;}\r\n");
      out.write("	#np {display: inline-block;}\r\n");
      out.write("	#np input {width: 120px;}\r\n");
      out.write("	.left {text-align: left;}\r\n");
      out.write("	#reply {border-bottom: 2px solid #3b4890;}\r\n");
      out.write("	#text {padding: 10px;}\r\n");
      out.write("	#text div:last-child {clear: both;}\r\n");
      out.write("	#ta {float: right;}\r\n");
      out.write("	textarea {width: 950px; height: 100px;}\r\n");
      out.write("	#nick {width: 150px;}\r\n");
      out.write("	button {width: 82px; height: 35px; background: #3b4890; color: white;\r\n");
      out.write("	border: 1px solid #29367c; border-bottom-width: 3px; margin-top: 10px;\r\n");
      out.write("	margin-bottom: 40px; font-weight: bold; border-radius: 2px;\r\n");
      out.write("	cursor: pointer;}\r\n");
      out.write("	#idea {margin-left: 10px; background: white; color: #3b4890;}\r\n");
      out.write("	.right {float: right;}\r\n");
      out.write("	#edit,#delete {background: #666; border-color: #444;}\r\n");
      out.write("	#delete {margin: 10px;}\r\n");
      out.write("	#del {width: 13px; height: 13px; margin: 0; background: url(x.png); background-size: cover; border: none;}\r\n");
      out.write("	#table {border-bottom: 1px solid gainsboro;}\r\n");
      out.write("	#tiv {margin-bottom: 30px;}\r\n");
      out.write("	span {color: #d31900;}\r\n");
      out.write("	.reTop {font-size: 14px; font-weight: bold; margin-bottom: 10px;}\r\n");
      out.write("	#right {float: right;}\r\n");
      out.write("	#left {float: left;}\r\n");
      out.write("	#delCheck {position: absolute; width: 218px; height: 31px;\r\n");
      out.write("    border: 2px solid #29367c;}\r\n");
      out.write("    #pc {width: 129px; height: 31px; margin: 0; padding: 0;}\r\n");
      out.write("    #check {width: 49px; height: 31px;}\r\n");
      out.write("    #x {width: 30px; height: 31px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<h1>Minami.com</h1>\r\n");
      out.write("	</header>\r\n");
      out.write("	<section>\r\n");
      out.write("		<h2>테스트 갤러리</h2>\r\n");
      out.write("		<div id=post>\r\n");
      out.write("			<div id=head>\r\n");
      out.write("				<b>");
      out.print(post.getTitle() );
      out.write("</b><br>\r\n");
      out.write("				<p id=sub><a href=#>");
      out.print(post.getWriter() );
      out.write("</a>&nbsp;&nbsp;|&nbsp;&nbsp;");
      out.print(post.getDate() );
      out.write("</p>\r\n");
      out.write("				<p class=\"right\">조회 ");
      out.print(post.getHits() );
      out.write(" | 추천 ");
      out.print(post.getRecommend() );
      out.write(" | 댓글 ");
      out.print(post.getReplyNum() );
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=con>");
      out.print(post.getContent() );
      out.write("</div>\r\n");
      out.write("			<div id=rec>\r\n");
      out.write("				");
      out.print(post.getRecommend() );
      out.write(" <input type=button value=추천>\r\n");
      out.write("				<input type=button value=비추> 0\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=reply>\r\n");
      out.write("			<div class=reTop id=left>\r\n");
      out.write("				전체 댓글 <span>");
      out.print(post.getReplyNum() );
      out.write("</span>개\r\n");
      out.write("				<select>\r\n");
      out.write("					<option>등록순\r\n");
      out.write("					<option>최신순\r\n");
      out.write("					<option>답글순\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=reTop id=right>본문 보기 | 댓글 닫기 | 새로고침</div>\r\n");
      out.write("			<div id=comment>\r\n");
      out.write("				<div id=tiv>\r\n");
      out.write("				");

					for (Reply r : replies) {
						if (r.getPost_idx() == idx) {
							
      out.write("\r\n");
      out.write("							<div id=table>\r\n");
      out.write("								<table>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<td class=left id=nick>");
      out.print(r.getNickname() );
      out.write("\r\n");
      out.write("										<td class=left>");
      out.print(r.getContents() );
      out.write("\r\n");
      out.write("										<td class=right>");
      out.print(r.getDate() );
      out.write("\r\n");
      out.write("										");

											if (session.getAttribute("name").equals(r.getNickname())) {
												
      out.write("<button id=del></button>");

											}
										
      out.write("\r\n");
      out.write("									</tr>\r\n");
      out.write("								</table>\r\n");
      out.write("							</div>\r\n");
      out.write("							");

						}
					}
				
      out.write("\r\n");
      out.write("				<div id=delCheck>\r\n");
      out.write("					<input id=pc type=password placeholder=비밀번호>\r\n");
      out.write("					<button id=check>확인</button><button id=x>X</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=text>\r\n");
      out.write("					<form action=\"result.jsp\" method=post>\r\n");
      out.write("						<div id=np>\r\n");
      out.write("							<input type=\"hidden\" name=idx value=");
      out.print(idx);
      out.write(">\r\n");
      out.write("							<input type=text placeholder=닉네임 name=nickname value=");
      out.print(session.getAttribute("name") );
      out.write("><br>\r\n");
      out.write("							<input type=password placeholder=비밀번호 name=pw>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div id=ta>\r\n");
      out.write("							<textarea name=text></textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div align=right><input type=submit value=등록></div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<button>전체글</button><button id=idea>개념글</button>\r\n");
      out.write("		<button class=right onclick=\"location.href='write.jsp'\">글쓰기</button>\r\n");
      out.write("		<button class=right id=delete>삭제</button>\r\n");
      out.write("		<button class=right id=edit>수정</button>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=50px>번호\r\n");
      out.write("				<th>제목\r\n");
      out.write("				<th width=50px>글쓴이\r\n");
      out.write("				<th width=100px>작성일\r\n");
      out.write("				<th width=50px>조회\r\n");
      out.write("				<th width=50px>추천\r\n");
      out.write("			</tr>\r\n");
      out.write("		");

			for(Post p : list) {
				String date;
				if (!p.getDate().substring(0,10).equals(LocalDate.now().toString()))
					date = p.getDate().substring(5,10);
				else
					date = p.getDate().substring(11,16);
				
      out.write("<tr>\r\n");
      out.write("					<td>");
      out.print(p.getIdx() );
      out.write("\r\n");
      out.write("					<td class=left><a href=\"result.jsp?idx=");
      out.print(p.getIdx() );
      out.write('"');
      out.write('>');
      out.print(p.getTitle() );
      out.write("</a>\r\n");
      out.write("					<td>");
      out.print(p.getWriter() );
      out.write("\r\n");
      out.write("					<td>");
      out.print(date );
      out.write("\r\n");
      out.write("					<td>");
      out.print(p.getHits() );
      out.write("\r\n");
      out.write("					<td>");
      out.print(p.getRecommend() );

			}
		
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("	</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
