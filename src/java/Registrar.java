/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jose veliz
 */
@WebServlet(urlPatterns = {"/Registrar"})
public class Registrar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros
        String numeroOrden = request.getParameter("numeroOrden");
        String fecha = request.getParameter("fecha");
        String cliente = request.getParameter("cliente");
        double total = Double.parseDouble(request.getParameter("total"));
        String observaciones = request.getParameter("observaciones");
        int tipo = Integer.parseInt(request.getParameter("tipo"));

        
        

        response.sendRedirect("ordenes.jsp");  // Redirige a la lista de órdenes
    }
}
