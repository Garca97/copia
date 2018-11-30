/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Usuario;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco
 */
public class UsuarioDAO {

    public Usuario find(Usuario usuario) {
        Usuario usuario1 = null;        
        PreparedStatement preparedStmt = null;
        String query = "SELECT * FROM USUARIO WHERE ID_USUARIO = "+usuario+" AND PASS = "+usuario.getContrasena() ;
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(AministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            preparedStmt.setInt(1, usuario.getId());            
            preparedStmt.setString(2, usuario.getContrasena());

            int id = 0;
            String pass = "";
            String tipo = "";            
            if (rs.next()) {
                id = rs.getInt("ID_USUARIO");
                pass = rs.getString("PASS");
                tipo = rs.getString("TIPO");                
                usuario1 = new Usuario(id, pass, tipo);
            }
            st.close();
        } catch (Exception e) {
            System.out.println("problema encontando usuario");
        }
        return usuario1;
    }
    public void pro(){
        System.out.println("alv");
    }

}
