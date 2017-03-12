/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.session;

import carrospartesejb.entity.Carros;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author flopez
 */
@Local
public interface CarrosFacadeLocal {

    void create(Carros carros);

    void edit(Carros carros);

    void remove(Carros carros);

    Carros find(Object id);

    List<Carros> findAll();

    List<Carros> findRange(int[] range);

    int count();
    
    
}
