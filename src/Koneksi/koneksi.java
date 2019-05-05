/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class koneksi {
    Connection con;
    
    public Connection getData (){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/database_galeri","root", "");
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Terhubung Database!");
        }
        
        return con;
    }
}
