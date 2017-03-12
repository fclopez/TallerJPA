/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.session;

import carrospartesejb.entity.Partes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author flopez
 */
@Stateless
public class PartesFacade extends AbstractFacade<Partes> implements PartesFacadeLocal {

    @PersistenceContext(unitName = "CarrosPartes-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PartesFacade() {
        super(Partes.class);
    }
    
}
