/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author flopez
 */
@Entity
@Table(name = "PROPIETARIO_CARROS", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropietarioCarros.findAll", query = "SELECT p FROM PropietarioCarros p")
    , @NamedQuery(name = "PropietarioCarros.findByIdPropietario", query = "SELECT p FROM PropietarioCarros p WHERE p.propietarioCarrosPK.idPropietario = :idPropietario")
    , @NamedQuery(name = "PropietarioCarros.findByPlacaCarro", query = "SELECT p FROM PropietarioCarros p WHERE p.propietarioCarrosPK.placaCarro = :placaCarro")})
public class PropietarioCarros implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PropietarioCarrosPK propietarioCarrosPK;
    @JoinColumn(name = "PLACA_CARRO", referencedColumnName = "PLACA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Carros carros;

    public PropietarioCarros() {
    }

    public PropietarioCarros(PropietarioCarrosPK propietarioCarrosPK) {
        this.propietarioCarrosPK = propietarioCarrosPK;
    }

    public PropietarioCarros(String idPropietario, String placaCarro) {
        this.propietarioCarrosPK = new PropietarioCarrosPK(idPropietario, placaCarro);
    }

    public PropietarioCarrosPK getPropietarioCarrosPK() {
        return propietarioCarrosPK;
    }

    public void setPropietarioCarrosPK(PropietarioCarrosPK propietarioCarrosPK) {
        this.propietarioCarrosPK = propietarioCarrosPK;
    }

    public Carros getCarros() {
        return carros;
    }

    public void setCarros(Carros carros) {
        this.carros = carros;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propietarioCarrosPK != null ? propietarioCarrosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropietarioCarros)) {
            return false;
        }
        PropietarioCarros other = (PropietarioCarros) object;
        if ((this.propietarioCarrosPK == null && other.propietarioCarrosPK != null) || (this.propietarioCarrosPK != null && !this.propietarioCarrosPK.equals(other.propietarioCarrosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carrospartesejb.entity.PropietarioCarros[ propietarioCarrosPK=" + propietarioCarrosPK + " ]";
    }
    
}
