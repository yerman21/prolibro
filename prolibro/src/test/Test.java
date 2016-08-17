/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ja
 */
import DAO.DAOlibro;
import DTO.DTOlibro;
import Util.Connexion;
import java.util.ArrayList;
import java.util.List;
public class Test {
    private static final DAOlibro Dl=new DAOlibro();

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
    public static void guardar()
    {
        DTOlibro dto=new DTOlibro("","","","","");
        int daniel=Dl.create(dto);
        if(daniel>0)
        {
            System.out.println("Si");
        }
        else
        {
            System.out.println("No");
        }
        
        
    }
    public static void modificar()
    {
        DTOlibro dto= new DTOlibro();
        dto.setId(4);
        int daniel=Dl.update(dto);
        if(daniel>0)
        {
            System.out.println("Si");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static void eliminar()
    {
        int c=3;
        int op = Dl.delete(c);
        
        if(op>0){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void listar()
    {
        List<DTOlibro> lista  = new ArrayList<>();
        lista = Dl.readAll();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
    }
}
