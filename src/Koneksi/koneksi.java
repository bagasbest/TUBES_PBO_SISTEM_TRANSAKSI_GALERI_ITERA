/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public ResultSet cariProduk(Connection con, String nama){
        
        String sql= "select * from produk where nama_produk='" + nama +"';";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(KoneksiCari.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
