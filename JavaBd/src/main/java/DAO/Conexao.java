/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.den
 */
public class Conexao {

    public Connection conectaBd() {
        Connection conn = null;
        
        try {
            
            String url = "jdbc:mysql://localhost/banco?user=root&password";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            
        }
        return conn;

    }

}
