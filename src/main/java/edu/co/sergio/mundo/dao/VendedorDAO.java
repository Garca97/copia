/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Vendedor;
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
public class VendedorDAO implements IBaseDatos<Vendedor> {

    @Override
    public List<Vendedor> findAll() {
        List<Vendedor> vendedores = null;
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
                if (vendedores == null) {
                    vendedores = new ArrayList<Vendedor>();
                }

                nombre = rs.getString("NOMBRE");
                id = rs.getInt("ID_EMPLEADO");
                direccion = rs.getString("DIRECCION");
                telefono = rs.getInt("TELEFONO");
                salario = rs.getFloat("SALARIO");
                clave = rs.getString("CLAVE");
                oficina = rs.getInt("OFICINA");
                nroventas = rs.getInt("NRO_VENTAS");

                if (oficina == 0) {
                    Vendedor registro = new Vendedor(nroventas, nombre, direccion, clave, id, telefono, salario);
                    registro.setNombre(nombre);
                    registro.setId(id);
                    registro.setDireccion(direccion);
                    registro.setTelefono(telefono);
                    registro.setSalario(salario);
                    registro.setClave(clave);
                    registro.setNumeroVentas(nroventas);
                    vendedores.add(registro);
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Persona");
            e.printStackTrace();
        }

        return vendedores;
    }

    
    public Vendedor find(int id)  {
        Vendedor registro = null;
        String query = "SELECT * FROM EMPLEADO WHERE ID_EMPLEADO ="+id;
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

                if (oficina == 0) {
                    registro = new Vendedor(nroventas, nombre, direccion, clave, id, telefono, salario);                   
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Persona");
            e.printStackTrace();
        }
        return registro;
    }

    
    public boolean insert(Vendedor t){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Vendedor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Vendedor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
