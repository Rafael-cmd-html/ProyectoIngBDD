/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.*;


public class ConexionBDD 
{
        String url = "Hospital.db";
        
        public static Connection conexion;
    public void conectar(){
        
        try{
            
            conexion = DriverManager.getConnection("jdbc:sqlite:" + url );
        }catch(SQLException ex){
            System.out.println("No ha podido establecer una conexion"+ ex);
        }
    }
   
    public void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
