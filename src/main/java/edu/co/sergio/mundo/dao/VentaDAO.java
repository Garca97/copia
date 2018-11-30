/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Venta;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.Date;
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
public class VentaDAO implements IBaseDatos<Venta>{

    @Override
    public List<Venta> findAll(){
        List<Venta> ventas = null;
        String query = "SELECT * FROM VENTA";
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
                        
            String codigobarr = "";
            String nombre = "";
            int cantidad = 0;
            float precioun = 0;
            float preciotot = 0;      
            int id_factura;

            while (rs.next()) {
                if (ventas == null) {
                    ventas = new ArrayList<Venta>();
                }

                codigobarr = rs.getString("CODIGOBARR");
                nombre = rs.getString("NOMBRE");                
                cantidad = rs.getInt("CANTIDAD");
                precioun = rs.getFloat("PRECIOUN");
                preciotot = rs.getFloat("PRECIOTOT");
                id_factura = rs.getInt("ID_FACTURA");               
                Venta registro = new Venta(codigobarr, nombre, cantidad, id_factura, precioun, preciotot);
                ventas.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Persona");
            e.printStackTrace();
        }

        return ventas;
    }

    @Override
    public boolean insert(Venta t){
        int result = 0;
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query = "insert into VENTA" + " values ("+t.getCodigo()+","+t.getNombre()+","+t.getCantidad()+","+t.getIdFactura()+")";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getCodigo());
            preparedStmt.setString(2, t.getNombre());
            preparedStmt.setInt(3, t.getCantidad());
            preparedStmt.setFloat(4, (float) t.getPrecioUnitario());
            preparedStmt.setFloat(5, (float) t.getPrecioTotal());
            preparedStmt.setInt(6, t.getIdFactura());
            
           

            result = preparedStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean update(Venta t){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Venta t){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Venta find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public List<Venta> findexc  (int id){
        List<Venta> ventas = null;
        PreparedStatement preparedStmt = null;
        String query = "SELECT * FROM VENTA where CODIGOBARR = ?";
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

            String codigobarr = "";
            String nombre = "";
            int cantidad = 0;
            float precioun = 0;
            float preciotot = 0;      
            int id_factura;

            while (rs.next()) {

                if (ventas == null) {
                    ventas = new ArrayList<Venta>();
                }

                codigobarr = rs.getString("CODIGOBARR");
                nombre = rs.getString("NOMBRE");
                cantidad = rs.getInt("CANTIDAD");
                precioun = rs.getFloat("PRECIOUN");
                preciotot = rs.getFloat("PRECIOTOT");
                id_factura = rs.getInt("ID_FACTURA");
                Venta registro = new Venta(codigobarr, nombre, cantidad, id_factura, precioun, preciotot);
                ventas.add(registro);
            }
            st.close();

        } catch (Exception e) {
        }
        return ventas;
    }
    
}
