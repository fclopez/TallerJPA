/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.session;

import carrospartesejb.entity.Carros;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

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

    @Override
    public List<Carros> consultarTodosCarros() {
        List<Carros> listaCarros = new ArrayList<Carros>(0);
        try {
            Query consulta = getEntityManager().createNamedQuery("Carros.findAll");
            listaCarros = consulta.getResultList();
            return listaCarros;
        } catch (Exception e) {
            printStackTrace(e);
        }
        return listaCarros;
    } 
    
}
