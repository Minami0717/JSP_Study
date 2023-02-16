/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-01-18 07:18:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mall.CartDao;
import mall.Cart;
import java.util.List;

public final class cartForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/footer.jsp", Long.valueOf(1672819729393L));
    _jspx_dependants.put("/jsp/menu.jsp", Long.valueOf(1673493562464L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("mall.Cart");
    _jspx_imports_classes.add("mall.CartDao");
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
      out.write("<!DOCTYPE html>\r\n");

	List<Cart> list = CartDao.getInstance().selectAll(session.getAttribute("id").toString());
	int total = 0;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Minami Mall</title>\r\n");
      out.write("<style>\r\n");
      out.write("	#title {background: #C3B091; height: 70px; padding: 100px;}\r\n");
      out.write("	.center {text-align: center;}\r\n");
      out.write("	table {margin-left: 30%; margin-top: 50px; margin-right: 30%;}\r\n");
      out.write("	th,td {border-top: 1px solid gainsboro; height: 50px;}\r\n");
      out.write("	th {text-align: left;}\r\n");
      out.write("	button {background: red; color: white; cursor: pointer; border: none;\r\n");
      out.write("		border-radius: 5px; padding: 3px;}\r\n");
      out.write("	#del{margin-left: 30%; margin-top: 50px;}\r\n");
      out.write("	#order {background: green; margin-left: 33%;}\r\n");
      out.write("	#con {background: gray; margin-left: 30%;}\r\n");
      out.write("	.btn {padding: 5px 10px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	* {margin: 0; padding: 0;}\r\n");
      out.write("	a {text-decoration: none; color: white;}\r\n");
      out.write("	#menu {background: #b2b4b2; padding: 10px;}\r\n");
      out.write("	#menu > a {margin-left: 100px;}\r\n");
      out.write("	li {display: inline-block; margin: 0 12px; color: white;}\r\n");
      out.write("	ul {float: right; margin-right: 100px;}\r\n");
      out.write("</style>\r\n");
      out.write("<div id=menu>\r\n");
      out.write("	<a href=home.jsp>Home</a>\r\n");
      out.write("	<ul>\r\n");
      out.write("		");

			if (session.getAttribute("id") == null) {
				
      out.write("<li><a href=loginForm.jsp>로그인</a>\r\n");
      out.write("				<li><a href=joinForm.jsp>회원가입</a>");

			}
			else {
				
      out.write("<li>[");
      out.print(session.getAttribute("id") );
      out.write("님]\r\n");
      out.write("				<li><a href=logout.jsp>로그아웃</a>\r\n");
      out.write("				<li><a href=memberUpdateForm.jsp>회원정보 수정</a>");

				
				if (session.getAttribute("id").equals("admin")) {
					
      out.write("<li><a href=addForm.jsp>상품 등록</a>\r\n");
      out.write("					<li><a href=updateForm.jsp>상품 수정</a>\r\n");
      out.write("					<li><a href=deleteForm.jsp>상품 삭제</a>");

				}
				else {
					
      out.write("<li><a href=cartForm.jsp>장바구니</a>\r\n");
      out.write("					<li><a href=orderList.jsp>주문 목록</a>");

				}
			}
		
      out.write("\r\n");
      out.write("		<li><a href=products.jsp>상품 목록</a>\r\n");
      out.write("		<li><a href=noticeForm.jsp>공지사항</a>\r\n");
      out.write("	</ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	<div id=title><h1 class=center>장바구니</h1></div>\r\n");
      out.write("	<button id=del class=btn onclick=del(");
      out.print(list.size() );
      out.write(")>전체 삭제</button>\r\n");
      out.write("	<button id=order class=btn onclick=order(");
      out.print(list.size() );
      out.write(")>주문하기</button>\r\n");
      out.write("	<table>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th width=400px>상품\r\n");
      out.write("			<th width=200px>가격\r\n");
      out.write("			<th width=100px>수량\r\n");
      out.write("			<th width=200px>소계\r\n");
      out.write("			<th width=100px>비고\r\n");
      out.write("		");

			for (Cart c : list) {
				total += c.getPrice()*c.getCount();
				
      out.write("<tr>\r\n");
      out.write("					<td>");
      out.print(c.getId()+" - "+c.getProduct() );
      out.write("\r\n");
      out.write("					<td>");
      out.print(c.getPrice() );
      out.write("\r\n");
      out.write("					<td>");
      out.print(c.getCount() );
      out.write("\r\n");
      out.write("					<td>");
      out.print(c.getPrice()*c.getCount() );
      out.write("\r\n");
      out.write("					<td><button onclick=\"location.href='delete.jsp?id=");
      out.print(c.getId());
      out.write("'\">삭제</button>");

			}
		
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td><td><td><b>총액</b><td><b>");
      out.print(total );
      out.write("</b><td>\r\n");
      out.write("	</table>\r\n");
      out.write("	<button id=con class=btn onclick=\"location.href='products.jsp'\">&laquo;쇼핑 계속하기</button>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	#f {margin: 100px;}\r\n");
      out.write("</style>\r\n");
      out.write("<p class=center id=f>&copy; 한국디지털직업전문학교");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("	function del(n) {\r\n");
      out.write("		if (n == 0)\r\n");
      out.write("			alert(\"상품이 존재하지 않습니다.\")\r\n");
      out.write("		else {\r\n");
      out.write("			if(confirm(\"상품을 전부 삭제할까요?\"))\r\n");
      out.write("				location.href=\"deleteAll.jsp\";\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	function order(n) {\r\n");
      out.write("		if (n == 0)\r\n");
      out.write("			alert(\"상품이 존재하지 않습니다.\")\r\n");
      out.write("		else {\r\n");
      out.write("			if(confirm(\"주문을 진행하시겠습니까?\"))\r\n");
      out.write("				location.href=\"orderForm.jsp\";\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
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