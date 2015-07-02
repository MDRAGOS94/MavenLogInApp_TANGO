package com.traistarudragos.servlet.session;

import com.traistarudragos.servlet.dao.UserDAO;
import com.traistarudragos.servlet.dao.UserDAOInMemory;
import com.traistarudragos.servlet.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logOutServlet")
public class ServletLogOut extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("WELCOME ADMIN");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("loggedIn", null);

        response.sendRedirect("dragos.jsp");
    }
}
