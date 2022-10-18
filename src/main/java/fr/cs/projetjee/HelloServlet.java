package fr.cs.projetjee;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        response.setContentType("text/html");
        request.getServletContext();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Bienvenue " + " " + request.getParameter("prenom")+" "+ request.getParameter("nom").toUpperCase()+ " "+ "! </h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}