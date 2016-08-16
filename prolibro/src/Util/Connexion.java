/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ja
 */
public class Connexion {
    private static final String URL="jdbc:mysql://localhost:3306/libro";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String USER="root";
    private static final String PASS="";
    public static Connection cx=null;
    
    public static Connection getConexion(){
    try{
        Class.forName(DRIVER);
        if(cx==null){
            cx=DriverManager.getConnection(URL,USER,PASS);            
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error en la Conexion "+e);
    }
    return cx;
    }
    public static void cerrar(){
        if(cx!=null){
        cx=null;
        }
    }
}
