package com.kms.filter;
import javax.servlet.*;
import java.io.IOException;
/**
 * Created by Administrator on 2017/7/6.
 */
public class Encoding implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
//        System.out.println(" servletRequest.setCharacterEncoding(\"utf-8\");");
//        System.out.println("servletRequest.setCharacterEncoding(\"utf-8\"); ");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
