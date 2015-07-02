package com.baltagdelia.servlet.filters;

import com.baltagdelia.servlet.dao.UserDAO;
import com.baltagdelia.servlet.dao.UserDAOInMemory;
import com.baltagdelia.servlet.model.User;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/DisplayUserNameFilter")
public class DisplayUserNameFilter implements Filter {
    private ServletContext context;

    public void init(FilterConfig fConfig) throws ServletException {
        this.context = fConfig.getServletContext();
        this.context.log("RequestLoggingFilter initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        if (session.getAttribute("loggedIn") != null) {
            String name = session.getAttribute("loggedIn").toString();

            UserDAO userDAO = new UserDAOInMemory();
            User user = userDAO.findUserByName(name);
            session.setAttribute("userName", user.getUserName());
        }



        chain.doFilter(request, response);

    }

    public void destroy() {
        //we can close resources here
    }
}
