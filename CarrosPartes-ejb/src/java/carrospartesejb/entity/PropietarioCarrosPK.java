/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author flopez
 */
@Embeddable
public class PropietarioCarrosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ID_PROPIETARIO")
    private String idPropietario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "PLACA_CARRO")
    private String placaCarro;

    public PropietarioCarrosPK() {
    }

    public PropietarioCarrosPK(String idPropietario, String placaCarro) {
        this.idPropietario = idPropietario;
        this.placaCarro = placaCarro;
    }

    public String getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPropietario != null ? idPropietario.hashCode() : 0);
        hash += (placaCarro != null ? placaCarro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropietarioCarrosPK)) {
            return false;
        }
        PropietarioCarrosPK other = (PropietarioCarrosPK) object;
        if ((this.idPropietario == null && other.idPropietario != null) || (this.idPropietario != null && !this.idPropietario.equals(other.idPropietario))) {
            return false;
        }
        if ((this.placaCarro == null && other.placaCarro != null) || (this.placaCarro != null && !this.placaCarro.equals(other.placaCarro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carrospartesejb.entity.PropietarioCarrosPK[ idPropietario=" + idPropietario + ", placaCarro=" + placaCarro + " ]";
    }
    
}
