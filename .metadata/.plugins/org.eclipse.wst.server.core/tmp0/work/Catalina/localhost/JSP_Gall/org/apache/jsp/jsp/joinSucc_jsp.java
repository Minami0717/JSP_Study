/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-01-17 01:10:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joinSucc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("	* {margin: 0; padding: 0;}\r\n");
      out.write("	a {text-decoration: none;}\r\n");
      out.write("	li,ul,h1 {display: inline-block;}\r\n");
      out.write("	\r\n");
      out.write("	header {background: #29367c; position: relative; height: 85px;}\r\n");
      out.write("	header a {color: white;}\r\n");
      out.write("	header li {font-size: 11px; color: #ccc; margin-left: 5px;}\r\n");
      out.write("	header li a:hover {text-decoration: underline;}\r\n");
      out.write("	header ul {position: absolute; right: 30%; top: 50px;}\r\n");
      out.write("	header h1 {position: absolute; left: 30%; top: 30px;}\r\n");
      out.write("	\r\n");
      out.write("	section {width: 40%; margin: 0 30%;}\r\n");
      out.write("	section div:first-child {border-bottom: 2px solid #29367c; padding: 10px 0; margin-top: 50px;}\r\n");
      out.write("	section div:first-child h4 {color: #29367c}\r\n");
      out.write("	section div:nth-child(2) {border: 1px #cecdce solid; border-radius: 5px; margin: 25px 0; padding: 30px 50px;}\r\n");
      out.write("	\r\n");
      out.write("	table label {font-weight: bold; font-size: 14px; display: inline-block; width: 180px;}\r\n");
      out.write("	td {padding: 10px;}\r\n");
      out.write("	\r\n");
      out.write("	input {margin: 3px;}\r\n");
      out.write("	.input {width: 450px; height: 30px;}\r\n");
      out.write("	#join {width: 635px; height: 40px; border: none; background: #29367c; color: white; cursor: pointer; margin-top: 10px;}\r\n");
      out.write("	.button {width: 110px; height: 30px;}\r\n");
      out.write("	\r\n");
      out.write("	input[name=nick] {width: 363px;}\r\n");
      out.write("	input[name=pwCheck] {margin-left: 183px;}\r\n");
      out.write("	input[name=email1],input[name=email2] {width: 155px;}\r\n");
      out.write("	select {height: 37px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<h1><a href=main.jsp>minami.com</a></h1>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><a href=>?????????</a> |\r\n");
      out.write("			<li><a href=>????????????</a> |\r\n");
      out.write("			<li><a href=>?????????</a> |\r\n");
      out.write("			<li><a href=>?????????</a> |\r\n");
      out.write("			<li><a href=>??????</a> |\r\n");
      out.write("			<li><a href=>??????</a> |\r\n");
      out.write("			<li><a href=>??????</a> |\r\n");
      out.write("			<li><a href=>?????????</a> |\r\n");
      out.write("			<li><a href=>????????????</a>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</header>\r\n");
      out.write("	<section>\r\n");
      out.write("		<div>\r\n");
      out.write("			<h4 align=left>?????? ?????? ??????</h4>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<button onclick=\"location.href='main.jsp'\">????????????</button>\r\n");
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
