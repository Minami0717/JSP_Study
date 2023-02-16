/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-01-31 07:44:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collections;
import java.util.Stack;
import java.util.ArrayList;
import gall.GallListDao;
import gall.GallList;
import java.util.List;

public final class delCheckForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/jsp/header.jsp", Long.valueOf(1674194479634L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("gall.GallListDao");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("gall.GallList");
    _jspx_imports_classes.add("java.util.Collections");
    _jspx_imports_classes.add("java.util.Stack");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("<!DOCTYPE html>\r\n");

	request.setCharacterEncoding("utf-8");
	Integer idx = Integer.parseInt(request.getParameter("idx"));
	Integer p_idx = Integer.parseInt(request.getParameter("p_idx"));
	String name = GallListDao.getInstance().selectGallName(idx);
	String type = request.getParameter("type");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	h2 a {color: #d2af8a;}\r\n");
      out.write("	section {margin: 0 25%;}\r\n");
      out.write("	section > div:last-child {border: 3px solid #d2af8a; margin: 100px 300px; text-align: center; padding: 50px;}\r\n");
      out.write("	\r\n");
      out.write("	section > div:last-child b {display: block; color: #d2af8a; font-size: 14px;}\r\n");
      out.write("	section > div:last-child button {width: 85px; height: 31px; color: #fff; border: none; border-radius: 2px; font-size: 12px; font-weight: bold; cursor: pointer;}\r\n");
      out.write("	section > div:last-child div {padding: 15px 0 0;}\r\n");
      out.write("	section button:first-of-type {background: #b2b4b2;}\r\n");
      out.write("	section button:last-of-type {background: #d2af8a;}\r\n");
      out.write("	\r\n");
      out.write("	#header {padding: 20px 0; border-bottom: 2px solid #d2af8a;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	List<GallList> gList = GallListDao.getInstance().selectAll();
	ArrayList<String> viList = (ArrayList)session.getAttribute("visitList");

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	* {margin: 0; padding: 0;}\r\n");
      out.write("	a {text-decoration: none; color: black;}\r\n");
      out.write("	a:not(h1 a,h4 a,h5 a,h2 a):hover {text-decoration: underline;}\r\n");
      out.write("	\r\n");
      out.write("	header {margin-top: 30px;}\r\n");
      out.write("	\r\n");
      out.write("	h1 {display: inline-block; margin-left: 25%; margin-right: 5%;}\r\n");
      out.write("	\r\n");
      out.write("	nav {background: /* #c9b18c */ #d2af8a; width: 100%; padding: 10px; margin-top: 20px; color: white;}\r\n");
      out.write("	nav ul {margin-left: 25%;}\r\n");
      out.write("	nav li {display: inline-block; margin-right: 15px; font-weight: bold;}\r\n");
      out.write("	nav a {color: white;}\r\n");
      out.write("	\r\n");
      out.write("	#search input {width: 315px; height: 35px; float: left; padding: 3px 9px 0; outline: none; border: none;}\r\n");
      out.write("	#search button {width: 40px; height: 40px; background: #d2af8a; border: none; background-size: cover;}\r\n");
      out.write("	#search {display: inline-block; border: 4px solid #d2af8a; height: 39px;}\r\n");
      out.write("	#search img {width: 25px;}\r\n");
      out.write("\r\n");
      out.write("	#visit {margin-left: 25%; margin-right: 25%; border: 1px solid gainsboro; padding: 10px; font-size: 12px; color: #d2af8a; font-weight: bold; background-color: rgb(240, 240, 240);}\r\n");
      out.write("    #visit img {height: 8px; cursor: pointer;}\r\n");
      out.write("    #visit button {background-color: white; padding: 0 4px; border: 1px solid gainsboro; margin: 0 5px; cursor: pointer;}\r\n");
      out.write("    #visit li,#visit ul {display: inline;}\r\n");
      out.write("    #visit a {color: black; font-weight: normal;}\r\n");
      out.write("    #visit ul img {margin: 0 10px; height: 7px; cursor: pointer;}\r\n");
      out.write("    #visit ul {margin-left: 5px;}\r\n");
      out.write("    \r\n");
      out.write("    .right {float: right;}\r\n");
      out.write("	.left {float: left;}\r\n");
      out.write("</style>\r\n");
      out.write("<header>\r\n");
      out.write("	<h1><a href=main.jsp>minami.com</a></h1>\r\n");
      out.write("	<div id=search>\r\n");
      out.write("		<input type=text placeholder=\"게시판 & 통합검색\">\r\n");
      out.write("		<button><img src=image/search2.png></button>\r\n");
      out.write("	</div>\r\n");
      out.write("	<nav>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><a href=#>메인</a>\r\n");
      out.write("			<li><a href=#>마이너</a>\r\n");
      out.write("			<li><a href=#>미니</a>\r\n");
      out.write("			<li>|\r\n");
      out.write("			<li><a href=#>블로그</a>\r\n");
      out.write("			<li><a href=#>뉴스</a>\r\n");
      out.write("			<li><a href=#>게임</a>\r\n");
      out.write("			<li><a href=#>위키</a>\r\n");
      out.write("			<li><a href=#>이벤트</a>\r\n");
      out.write("			<li><a href=#>이모티콘</a>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<div id=visit>\r\n");
      out.write("		최근 방문\r\n");
      out.write("        <button><img src=\"image/drop-down-arrow2.png\"></button>\r\n");
      out.write("        <img src=\"image/left.png\">\r\n");
      out.write("        <ul>\r\n");
      out.write("        ");

        	if (viList != null) {
        		for (int i = viList.size()-1; i >= 0; i--) {
        			int index = GallListDao.getInstance().selectIdx(viList.get(i));
            		
      out.write("<li><a href=\"gallMain.jsp?idx=");
      out.print(index );
      out.write('"');
      out.write('>');
      out.print( viList.get(i) );
      out.write("</a>\r\n");
      out.write("            		");

            			if (request.getQueryString() == null) {
            				
      out.write("<img src=\"image/x1.png\" onclick=\"location.href='delVisit.jsp?gall=");
      out.print( viList.get(i) );
      out.write("&url=");
      out.print(request.getRequestURL());
      out.write('\'');
      out.write('"');
      out.write('>');

            			}
            			else {
            				
      out.write("<img src=\"image/x1.png\" onclick=\"location.href='delVisit.jsp?gall=");
      out.print( viList.get(i) );
      out.write("&url=");
      out.print(request.getRequestURL()+"?"+request.getQueryString() );
      out.write('\'');
      out.write('"');
      out.write('>');

            			}
            	}
        	}
        
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"right\"><img src=\"image/right-arrow.png\"><a href=\"#\">전체</a></div>\r\n");
      out.write("	 </div>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("	<section>\r\n");
      out.write("		<div id=header>\r\n");
      out.write("			<h2><a href=gallMain.jsp?idx=");
      out.print(idx);
      out.write('>');
      out.print(name );
      out.write("</a></h2>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<b>삭제된 게시물은 복구할 수 없습니다.</b><br><b>게시물을 삭제하시겠습니까?</b>\r\n");
      out.write("			<div>\r\n");
      out.write("				<button onclick=history.back()>이전</button>\r\n");
      out.write("				<button onclick=\"location.href='delPost.jsp?idx=");
      out.print( idx );
      out.write("&p_idx=");
      out.print(p_idx);
      out.write("'\">삭제</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
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