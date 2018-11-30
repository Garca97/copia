/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Cliente;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco
 */
public class ClienteDAO  {


    public List<Cliente> findAll() {
        List<Cliente> clientes = null;
        String query = "SELECT * FROM CLIENTE";
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);            
            String nombre = null;
            String direccion = null;

            while (rs.next()) {
                if (clientes == null) {
                    clientes = new ArrayList<Cliente>();
                }

                               
                nombre = rs.getString("NOMBRE");
                direccion = rs.getString("DIRECCION");
                Cliente registro = new Cliente(nombre, direccion);
                clientes.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Persona");
            e.printStackTrace();
        }
        return clientes;
    }

    public Cliente find(String dir) {
        Cliente resultado = null;
        PreparedStatement preparedStmt = null;
        String query = "SELECT * FROM CLIENTE where DIRECCION ="+dir;
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            preparedStmt.setString(1, dir);
            String nombre = null;
            String direccion = null;

            if (rs.next()) {

                               
                nombre = rs.getString("NOMBRE");
                direccion = rs.getString("DIRECCION");
                resultado = new Cliente(nombre, direccion);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Persona");
            e.printStackTrace();
        }
        return resultado;
    }

}
