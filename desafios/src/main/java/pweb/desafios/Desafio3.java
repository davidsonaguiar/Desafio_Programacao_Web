package pweb.desafios;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "Desafio 3 PWEB", value = "/desafio3")
public class Desafio3 extends HttpServlet {

  public void 
  doPost(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException {

    HttpSession session = request.getSession(false);
    PrintWriter out = response.getWriter();

    if (session == null) {
      request.getSession(true);
      out.write("Ola, este e seu primeiro acesso.");
    } else {
      out.write("Olá, você já esteve por aqui.");
    }

  }

  public void 
  doDelete(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {

    HttpSession session = request.getSession();

    long lastSession = session.getLastAccessedTime();
    long now = System.currentTimeMillis();
    long timeLastAccessed = now - lastSession;
    long maxTime = 30000;

    PrintWriter out = response.getWriter();

    if(timeLastAccessed > maxTime) {
      session.invalidate();
      out.write("Sessão invá1lida. Último acesso ocorreu há mais de 30 segundos.");
    } else {
      out.write("Sessão vá1lida. Último acesso ocorreu há menos de 30 segundos."); 
    }

  }

}
