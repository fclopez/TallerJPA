/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.session;

import carrospartesejb.entity.CarrosPartes;
import carrospartesejb.entity.CarrosPartesPK;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author flopez
 */
@Stateless
public class CarrosPartesFacade extends AbstractFacade<CarrosPartes> implements CarrosPartesFacadeLocal {

    @PersistenceContext(unitName = "CarrosPartes-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CarrosPartesFacade() {
        super(CarrosPartes.class);
    }

    @Override
    public boolean insertarCarroParte(String placaCarro, String codigoParte, int cantidad) {
        CarrosPartesPK pk = new CarrosPartesPK(placaCarro, codigoParte);
        if(consultarCarrosPartes(pk)!= null){
            return false;
        }else{
            CarrosPartes cp = new CarrosPartes(pk,cantidad);
            em.persist(cp);
            return true;
        }
    }

    @Override
    public CarrosPartes consultarCarrosPartes(CarrosPartesPK pk) {
        return em.find(CarrosPartes.class, pk);
    }
    
}
