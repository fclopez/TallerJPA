/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.session;

import carrospartesejb.entity.PropietarioCarros;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author flopez
 */
@Local
public interface PropietarioCarrosFacadeLocal {

    void create(PropietarioCarros propietarioCarros);

    void edit(PropietarioCarros propietarioCarros);

    void remove(PropietarioCarros propietarioCarros);

    PropietarioCarros find(Object id);

    List<PropietarioCarros> findAll();

    List<PropietarioCarros> findRange(int[] range);

    int count();
    
}
