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
public class CarrosPartesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "PLACA_CARRO")
    private String placaCarro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CODIGO_PARTE")
    private String codigoParte;

    public CarrosPartesPK() {
    }

    public CarrosPartesPK(String placaCarro, String codigoParte) {
        this.placaCarro = placaCarro;
        this.codigoParte = codigoParte;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getCodigoParte() {
        return codigoParte;
    }

    public void setCodigoParte(String codigoParte) {
        this.codigoParte = codigoParte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placaCarro != null ? placaCarro.hashCode() : 0);
        hash += (codigoParte != null ? codigoParte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarrosPartesPK)) {
            return false;
        }
        CarrosPartesPK other = (CarrosPartesPK) object;
        if ((this.placaCarro == null && other.placaCarro != null) || (this.placaCarro != null && !this.placaCarro.equals(other.placaCarro))) {
            return false;
        }
        if ((this.codigoParte == null && other.codigoParte != null) || (this.codigoParte != null && !this.codigoParte.equals(other.codigoParte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carrospartesejb.entity.CarrosPartesPK[ placaCarro=" + placaCarro + ", codigoParte=" + codigoParte + " ]";
    }
    
}
