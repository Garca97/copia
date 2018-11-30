/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

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
import pos.Producto;

/**
 *
 * @author Marco
 */
public class ProductoDAO implements IBaseDatos<Producto> {

    @Override
    public List<Producto> findAll(){
        List<Producto> productos = null;
        String query = "SELECT * FROM PRODUCTO";
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            String Nombre = "";
            int CodigoBarras = 0;
            int Cantidad = 0;
            float Precio = 0;
            
            while (rs.next()) {
                if (productos == null) {
                    productos = new ArrayList<Producto>();
                }
                Producto producto = new Producto();
                Nombre = rs.getString("NOMBRE");
                producto.setNombre(Nombre);
                
                CodigoBarras = rs.getInt("CODIGOBARR");
                producto.setCodigoBarras(CodigoBarras);
                
                Cantidad = rs.getInt("CANTIDAD");
                producto.setCantidad(Cantidad);
                
                Precio = rs.getFloat("PRECIO");
                producto.setPrecio(Precio);
                
                productos.add(producto);
            }
            st.close();
        } catch (Exception e) {
            System.out.println("error al obtener productos");
        }
        return productos;
    }

    @Override
    public boolean insert(Producto t) {
        int result = 0;
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query = " insert into PRODUCTO" + " values ("+t.getNombre()+","+t.getCodigoBarras()+","+t.getCantidad()+","+t.getPrecio()+")";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            preparedStmt.setInt(2, t.getCodigoBarras());
            preparedStmt.setInt(3, t.getCantidad());
            preparedStmt.setFloat(4, (float)t.getPrecio());
            
            result = preparedStmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("problemas insertando producto");
        }
        if(result==0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean update(Producto t) {
        boolean result = false;
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query = "update PRODUCTO set NOMBRE ="+t.getNombre()+", CANTIDAD = "+t.getCantidad()+", PRECIO = "+t.getPrecio()+"  where CODIGOBARR ="+t.getCodigoBarras();
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            preparedStmt.setInt(2, t.getCantidad());
            preparedStmt.setFloat(3, (float)t.getPrecio());
            preparedStmt.setInt(4, t.getCodigoBarras());
            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean delete(Producto t){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Producto find(int id) {
        Producto producto = null;
        PreparedStatement preparedStmt = null;
        String query = "SELECT * FROM PRODUCTO where CODIGOBARR ="+id;
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
            String Nombre = "";
            int CodigoBarras = 0;
            int Cantidad = 0;
            float Precio = 0;
            if(rs.next()){
                producto = new Producto();
                Nombre = rs.getString("NOMBRE");
                producto.setNombre(Nombre);
                
                CodigoBarras = rs.getInt("CODIGOBARR");
                producto.setCodigoBarras(CodigoBarras);
                
                Cantidad = rs.getInt("CANTIDAD");
                producto.setCantidad(Cantidad);
                
                Precio = rs.getFloat("PRECIO");
                producto.setPrecio(Precio);
            }
            st.close();
        } catch (Exception e) {
            System.out.println("error al encontrar persona");
        }
        return producto;
    }
}