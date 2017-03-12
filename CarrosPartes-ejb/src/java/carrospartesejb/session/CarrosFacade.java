/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.session;

import carrospartesejb.entity.Carros;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author flopez
 */
@Stateless
public class CarrosFacade extends AbstractFacade<Carros> implements CarrosFacadeLocal {

    @PersistenceContext(unitName = "CarrosPartes-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CarrosFacade() {
        super(Carros.class);
    }
    
}
