package com.traistarudragos.servlet.filters;

import com.traistarudragos.servlet.dao.UserDAOInMemory;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/RequestLoggingFilter")
public class RequestLoggingFilter implements Filter {
    private ServletContext context;

    public void init(FilterConfig fConfig) throws ServletException {
        this.context = fConfig.getServletContext();
        this.context.log("RequestLoggingFilter initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        /*
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        Enumeration<String> params = req.getParameterNames();
        while (params.hasMoreElements()) {
            String name = params.nextElement();
            String value = request.getParameter(name);

            UserDAOInMemory userDAOInMemory = new UserDAOInMemory();
            for (int i = 0; i < userDAOInMemory.getListOfUsers().size(); i++) {
                if (name.equals(userDAOInMemory.getListOfUsers().get(i).getUserName())) {
                    res.sendRedirect("dragos.jsp");
                    return;
                }
            }

            this.context.log(req.getRemoteAddr() + "::Request Params::{" + name + "=" + value + "}");
        }

        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                this.context.log(req.getRemoteAddr() + "::Cookie::{" + cookie.getName() + "," + cookie.getValue() + "}");
            }
        }
        // pass the request along the filter chain
        chain.doFilter(request, response);*/

        // String nextJSP = "/dragos.jsp";
        // RequestDispatcher dispatcher = this.context.getRequestDispatcher(nextJSP);
        // dispatcher.forward(request,response);


        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = req.getRequestURI();
        this.context.log("Requested Resource::" + uri);

        HttpSession session = req.getSession(false);
        if (session.getAttribute("loggedIn") != null) {
            res.sendRedirect("index.jsp");
        }
        chain.doFilter(request, response);

        /*
        if (session == null || session.getAttribute("loggedIn") == null ) {
            this.context.log("Unauthorized access request");
            //res.sendRedirect("dragos.jsp");
        } else {
            // pass the request along the filter chain
            chain.doFilter(request, response);
            res.sendRedirect("index.jsp");
        }*/



    }

    public void destroy() {
        //we can close resources here
    }

}
