package com.traistarudragos.servlet.session;

import com.traistarudragos.servlet.dao.UserDAO;
import com.traistarudragos.servlet.dao.UserDAOInMemory;
import com.traistarudragos.servlet.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;;

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

        UserDAO userDAO = new UserDAOInMemory();
        if (userDAO.findUserByNamePassword(user, password) != null) {
            HttpSession session = request.getSession();
            session.setAttribute("loggedIn", user);

            //session.setMaxInactiveInterval(30*60);
            Cookie userName = new Cookie("user", user);
            userName.setMaxAge(30 * 60);
            response.addCookie(userName);

            UserDAOInMemory userDAOInMemory = new UserDAOInMemory();
            User userToDisplayOnJSP = userDAOInMemory.findUserByName(user);
            request.setAttribute("user", userToDisplayOnJSP);

            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(request, response);
        } else {
            request.setAttribute("errorMessage", "INVALID LOGIN !");
            request.getRequestDispatcher("/dragos.jsp").forward(request, response);
        }
    }
}
