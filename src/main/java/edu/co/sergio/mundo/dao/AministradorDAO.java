/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Administrador;
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
public class AministradorDAO implements IBaseDatos<Administrador> {

    @Override
    public List<Administrador> findAll() {
        List<Administrador> administradores = null;
        String query = "SELECT * FROM EMPLEADO";
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
            int id = 0;
            String direccion = "";
            int telefono = 0;
            float salario = 0;
            String clave = "";
            int oficina = 0;
            int nroventas = 0;

            while (rs.next()) {
                if (administradores == null) {
                    administradores = new ArrayList<Administrador>();
                }

                nombre = rs.getString("NOMBRE");
                id = rs.getInt("ID_EMPLEADO");
                direccion = rs.getString("DIRECCION");
                telefono = rs.getInt("TELEFONO");
                salario = rs.getFloat("SALARIO");
                clave = rs.getString("CLAVE");
                oficina = rs.getInt("OFICINA");
                nroventas = rs.getInt("NRO_VENTAS");

                if (nroventas == 0) {
                    Administrador registro= new Administrador(oficina, nombre, direccion, clave, id, telefono, salario);                    
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Persona");
            e.printStackTrace();
        }

        return administradores;
    }

    public Administrador find(int id) throws SQLException {
        Administrador registro = null;
        String query = "SELECT * FROM EMPLEADO WHERE ID_EMPLEADO = ?";
        PreparedStatement preparedStmt = null;
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            preparedStmt.setInt(1, id);
            String nombre = null;
            int id1 = 0;
            String direccion = "";
            int telefono = 0;
            float salario = 0;
            String clave = "";
            int oficina = 0;
            int nroventas = 0;

            if (rs.next()) {

                nombre = rs.getString("NOMBRE");
                id = rs.getInt("ID_EMPLEADO");
                direccion = rs.getString("DIRECCION");
                telefono = rs.getInt("TELEFONO");
                salario = rs.getFloat("SALARIO");
                clave = rs.getString("CLAVE");
                oficina = rs.getInt("OFICINA");
                nroventas = rs.getInt("NRO_VENTAS");

                if (nroventas == 0) {
                    registro = new Administrador(oficina, nombre, direccion, clave, id, telefono, salario);
                    registro.setNombre(nombre);
                    registro.setId(id);
                    registro.setDireccion(direccion);
                    registro.setTelefono(telefono);
                    registro.setSalario(salario);
                    registro.setClave(clave);
                    registro.setOficina(oficina);
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Persona");
            e.printStackTrace();
        }
        return registro;
    }

    @Override
    public boolean insert(Administrador t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Administrador t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Administrador t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   

}
