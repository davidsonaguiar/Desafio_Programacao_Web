package pweb.desafios;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Desafio 2 PWEB", urlPatterns = "/desafio2/")
public class Desafio2 extends HttpServlet {

  private String returnInexistIfNull(String str) {
    return str == null ? "Inexistente" : str.toString();
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    Integer maxAgeSeconds = 1000;
    
    String contentTypeReq = returnInexistIfNull(request.getHeader("content-type"));
    String acceptEncodingReq = returnInexistIfNull(request.getHeader("Accept-Encoding")); 
    String pathReq = returnInexistIfNull(request.getRequestURL().toString());     
    String schemeReq = returnInexistIfNull(request.getScheme()); 

    
    response.setHeader("Cache-Control", "max-age=" + maxAgeSeconds);
    response.setHeader("Content-Encoding", "gzip, text/plain");
    response.setContentType("application/text/html; charset=UTF-8");
    
    response.getWriter().write(
      "Requisicao: " + 
      "\nPath: " + pathReq + 
      "\nContent-type: " + contentTypeReq + 
      "\nAcceptEncoding: " + acceptEncodingReq +
      "\nScheme: " + schemeReq 
    );

  }

}
