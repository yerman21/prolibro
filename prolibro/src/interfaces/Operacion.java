/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author Daniel
 * @param <Entidad>
 */
public interface Operacion<Entidad> {
public int create(Entidad e);
    public int update(Entidad e);
    public int delete(Object key);
    public List<Entidad>readAll();
    public Entidad read(Object e);
    public boolean search(String e);
}
