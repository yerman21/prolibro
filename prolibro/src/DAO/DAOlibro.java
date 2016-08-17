/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTOlibro;
import Util.Connexion;
import interfaces.Operacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class DAOlibro implements Operacion<DTOlibro>{
    
    private Connection cx;
    private PreparedStatement ps;
    private ResultSet rs;
   
    private static final String Sql_create="INSERT INTO libro (id,titulo,autor,editorial, fechaimpresion, estado) VALUES (NULL, ?, ?, ?, ?, ?)";
    private static final String Sql_update="UPDATE libro SET estado=? WHERE id = ?";
    private static final String Sql_delete="DELETE FROM libro WHERE id =?";
    private static final String Sql_readAll="SELECT *FROM libro";
    private static final String Sql_read="SELECT *FROM libro WHERE nombre=?";
    private static final String Sql_search="SELECT¨*FROM libro WHERE nombre=?";

    @Override
    public int create(DTOlibro e) {
int a=0;
        try {
            cx=Connexion.getConexion();
            ps=cx.prepareStatement(Sql_create);
            ps.setString(1,e.getTitulo());
            ps.setString(2, e.getAutor());
            ps.setString(3, e.getEditorial());
            ps.setString(4, e.getFechaimpresion());
            ps.setString(5, e.getEstado());
            a=ps.executeUpdate();
            
        } catch (Exception z) {
            JOptionPane.showMessageDialog(null, "create"+z);
        }finally
        {
            Connexion.cerrar();
        }
        return a;
    
    }

    @Override
    public int update(DTOlibro e) {
int b=0;
        try {
            cx=Connexion.getConexion();
            ps=cx.prepareStatement(Sql_update);
            
            ps.setString(1, e.getEstado()); 
            ps.setInt(2, e.getId());
            b=ps.executeUpdate();
            
        } catch (Exception z) {
            JOptionPane.showMessageDialog(null, "update"+z);
        }finally
        {
            Connexion.cerrar();
        }
        return b; 
    }

    @Override
    public int delete(Object key) {
int c=0;
        try {
            cx=Connexion.getConexion();
            ps=cx.prepareStatement(Sql_delete);
            ps.setObject(1, key);
            c=ps.executeUpdate();
        } catch (Exception z) 
        {
            JOptionPane.showMessageDialog(null,"delete" +z);
        }finally{
            Connexion.cerrar();
        }return c;
    }

    @Override
    public List<DTOlibro> readAll() {
        List<DTOlibro>Lista=new ArrayList<>();
        try {
            cx=Connexion.getConexion();
            ps=cx.prepareStatement(Sql_readAll);
            rs=ps.executeQuery();
            while(rs.next())
            {
                DTOlibro dto=new DTOlibro();
                dto.setId(rs.getInt("id"));
                dto.setTitulo(rs.getString("titulo"));
                dto.setAutor(rs.getString( "autor"));
                dto.setEditorial(rs.getString("editorial"));
                dto.setFechaimpresion(rs.getString("fechaimpresion"));
                dto.setEstado(rs.getString("estado"));
                Lista.add(dto);
            }
        } catch (Exception z) 
        {
            JOptionPane.showMessageDialog(null, "readAll"+z);
        }finally{
            Connexion.cerrar();
        }return Lista;
    }

    @Override
    public DTOlibro read(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean search(String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}