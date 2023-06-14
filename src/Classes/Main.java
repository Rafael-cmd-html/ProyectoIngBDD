/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.sun.jdi.connect.spi.Connection;
import windowsSystem.Login;


import Classes.ConexionBDD;
import Classes.Main;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author Rafael Castillejos
 */
public class Main {
    
    
        
    public static ConexionBDD cone= new ConexionBDD();
    public static void main(String args[]) {
        cone.conectar();
        Login inicioS= new Login();
        inicioS.setVisible(true);
           
    }
}
