package oodcloud.tomcat;


import oodcloud.tomcat.exception.ServletException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author wangyujie
 * @ClassName Servlet
 * @Description
 * @date 2019/7/16 0016
 */
public interface Servlet {
    void init(ServletConfig var1) throws ServletException;

    ServletConfig getServletConfig();

    void service(ServletRequest request, ServletResponse response) throws ServletException, IOException;

    String getServletInfo();

    void destroy();
}
