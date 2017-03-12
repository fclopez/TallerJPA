/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.session;

import carrospartesejb.entity.CarrosPartes;
import carrospartesejb.entity.CarrosPartesPK;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author flopez
 */
@Local
public interface CarrosPartesFacadeLocal {

    void create(CarrosPartes carrosPartes);

    void edit(CarrosPartes carrosPartes);

    void remove(CarrosPartes carrosPartes);

    CarrosPartes find(Object id);

    List<CarrosPartes> findAll();

    List<CarrosPartes> findRange(int[] range);

    int count();
    
            /* signatura de dos metodos*/
    boolean insertarCarroParte(String codigoParte, String placaCarro, int cantidad);
    
    CarrosPartes consultarCarrosPartes(CarrosPartesPK pk);
    
}
