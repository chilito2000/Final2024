/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jose Veliz
 */
@WebServlet(urlPatterns = {"/Mostrar", "/MostrarOrdenesServlet"})
public class Mostrar extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrdenDAO ordenDAO = new OrdenDAO();
        List<Orden> listaOrdenes = ordenDAO.obtenerOrdenes();

        request.setAttribute("listaOrdenes", listaOrdenes);
        request.getRequestDispatcher("ordenes.jsp").forward(request, response);
    }
}
     }

