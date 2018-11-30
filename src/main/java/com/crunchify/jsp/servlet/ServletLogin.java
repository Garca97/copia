/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crunchify.jsp.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("Usuario");
        String pass = request.getParameter("pass");
        request.setAttribute("Usuario", usuario);
        request.setAttribute("pass", pass);
        //Redireccionando la informacion
        RequestDispatcher redireccion = request.getRequestDispatcher("/resources/otra.jsp");
        redireccion.forward(request, response);
    }
}
