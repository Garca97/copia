/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;


import edu.co.sergio.mundo.vo.Caja;
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
public class CajaDAO implements IBaseDatos<Caja>{

    @Override
    public List<Caja> findAll(){
        List<Caja> cajas = null;
        String query = "SELECT * FROM CAJA";
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int numero = 0;
            float saldo = 0;
            int id_empleado = 0;
            while(rs.next()){
                if (cajas == null) {
                    cajas = new ArrayList<Caja>();
                }
                
                numero = rs.getInt("NUMERO");
                saldo = rs.getFloat("SALDO");
                Caja registro = new Caja(numero, saldo);
                id_empleado = rs.getInt("ID_EMPLEADO");
                cajas.add(registro);
            }
        } catch (Exception e) {
        }
        return cajas;
    }


    public Caja find(int id) throws SQLException {
        Caja resultado = null;
        PreparedStatement preparedStmt = null;
        String query = "SELECT * FROM CAJA where NUMERO = "+id;
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
            int numero = 0;
            float saldo = 0;
            int id_empleado = 0;

            if (rs.next()) {

                
                numero = rs.getInt("NUMERO");
                saldo = rs.getFloat("SALDO");
                Caja registro = new Caja(numero, saldo);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Persona");
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public boolean insert(Caja t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Caja t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Caja t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
