/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.sun.jdi.connect.spi.Connection;
import windowsSystem.Login;


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
