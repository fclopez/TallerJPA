/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartes.managed;

//import javax.inject.Named;
//import javax.enterprise.context.RequestScoped;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import carrospartesejb.session.*;
/**
 *
 * @author flopez
 */
//@Named(value = "indexBean")
@ManagedBean
@RequestScoped
public class IndexBean {

    private String codigoParte;
    private String placaCarro;
    private int cantidad;
    
    @EJB
    private CarrosPartesFacadeLocal gestionCarros;

    public boolean insertarParteCarro() {
        return gestionCarros.insertarCarroParte(codigoParte, placaCarro, cantidad);
        //return true;
    }
    
    public String getCodigoParte() {
        return codigoParte;
    }

    public void setCodigoParte(String codigoParte) {
        this.codigoParte = codigoParte;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * Creates a new instance of IndexBean
     */
    public IndexBean() {
    }
    
}
