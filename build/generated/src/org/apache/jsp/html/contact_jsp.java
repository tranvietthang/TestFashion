package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/html/header.jsp");
    _jspx_dependants.add("/html/box.jsp");
    _jspx_dependants.add("/html/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"./css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"./css/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"title-wrap\">\n");
      out.write("            <p class=\"title\">My Fashion Blog</p>\n");
      out.write("            <p class=\"subtitle\">Welcome to my website</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <a href=\"home\" class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == \"Home\" ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">My Fashion Blog</a>\n");
      out.write("            <a href=\"about\" class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == \"About\" ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">About Me</a>\n");
      out.write("            <a href=\"contact\" class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == \"Contac\" ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Contact</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <table>\n");
      out.write("                    <td class=\"left\">\n");
      out.write("                        <p class=\"page-title\">Contact Me</p>\n");
      out.write("                        <div class=\"section2\">\n");
      out.write("                            <p class=\"send\">Send your message</p>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <p>Write your message here. Fill out the form:</p>\n");
      out.write("\n");
      out.write("                        <form action=\"contact\">\n");
      out.write("                            <input type=\"text\" name=\"name\" placeholder=\"Write your name here\" \n");
      out.write("                                   id=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required \n");
      out.write("                                   class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status == true ? 'sent' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <input type=\"email\" name=\"email\" placeholder=\"Write your email here\"\n");
      out.write("                                   id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required\n");
      out.write("                                   class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status == true ? 'sent': ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <textarea name=\"message\" placeholder=\"Write your message here\"\n");
      out.write("                                      id=\"textarea\" required\n");
      out.write("                                      class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status == true ? 'sent-mess' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></textarea>\n");
      out.write("                            <button type=\"submmit\" id=\"button\"          \n");
      out.write("                                    class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status == true ? 'clicked' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status == true ? 'Sent' : 'Sent - Click here'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </button>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"right\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"./css/box.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <p class=\"share\">Share this page</p>\n");
      out.write("            <a href=\"#\" class=\"share-on\" id=\"fb\">Share on Facebook</a><br>\n");
      out.write("            <a href=\"#\" class=\"share-on\" id=\"tw\">Share on Twitter</a><br>\n");
      out.write("            <a href=\"#\" class=\"share-on\" id=\"gg\">Share on Google+</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"./css/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <a  href=\"#\" class=\"footer-info\">Created with Simplesite</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alert!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <input placeholder=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status == true ? 'success' : 'error'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" id=\"notice\" readonly>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
