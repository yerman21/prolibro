/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolibro;

/**
 *
 * @author ja
 */
import Util.Connexion;
public class Prolibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conectar();
    }
    public static void conectar(){        
        Connexion.getConexion();
        if(Connexion.cx!=null){
            System.out.println("SI");
        }else{System.out.println("NO");}
        Connexion.cerrar();
        if(Connexion.cx!=null){
            System.out.println("SI");
        }else{System.out.println("NO");}
    }
}
