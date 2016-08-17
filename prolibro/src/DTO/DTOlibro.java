/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ja
 */
public class DTOlibro {
    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private String fechaimpresion;
    private String estado;

    public DTOlibro() {
    }

    public DTOlibro(String titulo, String autor, String editorial, String fechaimpresion, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaimpresion = fechaimpresion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFechaimpresion() {
        return fechaimpresion;
    }

    public void setFechaimpresion(String fechaimpresion) {
        this.fechaimpresion = fechaimpresion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
