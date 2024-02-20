package mx.edu.utez.sda.sdaservletjavascript.control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PokemonServlet", value = "/PokemonServlet")
public class PokemonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String caracteristicas = req.getParameter("caracteristicas");
        System.out.println(":>"+caracteristicas);
        req.setAttribute("nombreA",nombre);
        req.setAttribute("caract",caracteristicas);
        req.getRequestDispatcher("/WEB-INF/resultado.jsp").forward(req, resp);
    }
}
