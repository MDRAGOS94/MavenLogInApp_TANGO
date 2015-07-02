package com.traistarudragos.servlet.session;

import com.traistarudragos.servlet.handlers.AuthenticationHandler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/loginServlet")
public class ServletLogin extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("WELCOME ADMIN");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("userName");
        String password = request.getParameter("userPassword");

        AuthenticationHandler authenticationHandler = new AuthenticationHandler();
        if (authenticationHandler.checkLogin(user, password) == true) {
            HttpSession session = request.getSession();
            session.setAttribute("loggedIn", true);

            //session.setMaxInactiveInterval(30*60);
            Cookie userName = new Cookie("user", user);
            userName.setMaxAge(30*60);
            response.addCookie(userName);
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("errorMessage", "INVALID LOGIN !");
            request.getRequestDispatcher("/LoginPage.jsp").forward(request, response);
        }
    }
}

