/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-01-03 06:57:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1672715798389L));
    _jspx_dependants.put("/menu.jsp", Long.valueOf(1672725150123L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	#title {background: #C3B091; height: 70px; padding: 100px;}\r\n");
      out.write("	.center {text-align: center;}\r\n");
      out.write("	#form {margin-left: 40%;}\r\n");
      out.write("	input[type=text],input[type=number] {height: 35px; margin: 0 100px;}\r\n");
      out.write("	textarea {margin-left: 100px; width: 300px; height: 30px;}\r\n");
      out.write("	input[name=price],input[name=category],span {margin-left: 140px;}\r\n");
      out.write("	input[name=maker],input[name=stock] {margin-left: 120px;}\r\n");
      out.write("	input[type=file] {margin-left: 90px; border: 1px solid black; padding: 10px;}\r\n");
      out.write("	form div {margin: 10px;}\r\n");
      out.write("	input[type=submit] {height: 35px; width: 55px; background: aqua; border: none;\r\n");
      out.write("		border-radius: 5px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("<style>\r\n");
      out.write("	* {margin: 0; padding: 0;}\r\n");
      out.write("	a {text-decoration: none; color: white;}\r\n");
      out.write("	#menu {background: #b2b4b2;; height: 50px;}\r\n");
      out.write("	li {display: inline-block; margin: 12px;}\r\n");
      out.write("	ul {margin-left: 100px;}\r\n");
      out.write("</style>\r\n");
      out.write("<div id=menu>\r\n");
      out.write("	<ul>\r\n");
      out.write("		<li><a href=home.jsp>Home</a>\r\n");
      out.write("		<li><a href=products.jsp>Product</a>\r\n");
      out.write("		<li><a href=addForm.jsp>Add Product</a>\r\n");
      out.write("	</ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	<div id=title><h1 class=center>상품 등록</h1></div>\r\n");
      out.write("	<div id=form>\r\n");
      out.write("		<form action=add.jsp method=post>\r\n");
      out.write("			<div>상품 코드<input type=text name=id></div>\r\n");
      out.write("			<div>상품 이름<input type=text name=name></div>\r\n");
      out.write("			<div>가격<input type=\"number\" name=price></div>\r\n");
      out.write("			<div>상세 내용<textarea name=des></textarea></div>\r\n");
      out.write("			<div>제조사<input type=\"text\" name=maker></div>\r\n");
      out.write("			<div>분류<input type=\"text\" name=category></div>\r\n");
      out.write("			<div>재고 수<input type=\"number\" name=stock></div>\r\n");
      out.write("			<div>상태\r\n");
      out.write("				<span>\r\n");
      out.write("					<input type=\"radio\" id=n name=condition value=New>\r\n");
      out.write("					<label for=n>신규 제품</label>\r\n");
      out.write("					<input type=\"radio\" id=o name=condition value=Old>\r\n");
      out.write("					<label for=o>중고 제품</label>\r\n");
      out.write("					<input type=\"radio\" id=r name=condition value=Refurbished>\r\n");
      out.write("					<label for=r>재생 제품</label>\r\n");
      out.write("				</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>상품 이미지<input type=\"file\" name=image></div>\r\n");
      out.write("			<div><input type=submit value=등록></div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	#f {margin-top: 100px;}\r\n");
      out.write("</style>\r\n");
      out.write("<p class=center id=f>&copy; 한국디지털직업전문학교");
      out.write("\r\n");
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
