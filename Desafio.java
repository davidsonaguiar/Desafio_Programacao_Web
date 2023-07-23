package br.edu.ifal.pweb01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Desafio PWEB", urlPatterns = "/desafio/*")
public class Desafio extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String domain = request.getParameter("domain");

        if (domain == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        try {
            response.getWriter().write("<h1>" + Datas.domainIps.get(domain) + "</h1>");
        } catch (Exception e) {
            response.getWriter().write(e.getMessage());
        }

    }

}