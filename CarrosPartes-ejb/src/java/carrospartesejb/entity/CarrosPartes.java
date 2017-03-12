/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.entity;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "CARROS_PARTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarrosPartes.findAll", query = "SELECT c FROM CarrosPartes c")
    , @NamedQuery(name = "CarrosPartes.findByPlacaCarro", query = "SELECT c FROM CarrosPartes c WHERE c.carrosPartesPK.placaCarro = :placaCarro")
    , @NamedQuery(name = "CarrosPartes.findByCodigoParte", query = "SELECT c FROM CarrosPartes c WHERE c.carrosPartesPK.codigoParte = :codigoParte")
    , @NamedQuery(name = "CarrosPartes.findByCantidad", query = "SELECT c FROM CarrosPartes c WHERE c.cantidad = :cantidad")})
public class CarrosPartes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CarrosPartesPK carrosPartesPK;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @JoinColumn(name = "PLACA_CARRO", referencedColumnName = "PLACA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Carros carros;
    @JoinColumn(name = "CODIGO_PARTE", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Partes partes;

    public CarrosPartes() {
    }

    public CarrosPartes(CarrosPartesPK carrosPartesPK) {
        this.carrosPartesPK = carrosPartesPK;
    }

    public CarrosPartes(String placaCarro, String codigoParte) {
        this.carrosPartesPK = new CarrosPartesPK(placaCarro, codigoParte);
    }
    
            /*un constructor*/
    public CarrosPartes(CarrosPartesPK carrosPartesPK, int cantidad){
        this.carrosPartesPK = carrosPartesPK;
        this.cantidad = cantidad;
    }

    public CarrosPartesPK getCarrosPartesPK() {
        return carrosPartesPK;
    }

    public void setCarrosPartesPK(CarrosPartesPK carrosPartesPK) {
        this.carrosPartesPK = carrosPartesPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Carros getCarros() {
        return carros;
    }

    public void setCarros(Carros carros) {
        this.carros = carros;
    }

    public Partes getPartes() {
        return partes;
    }

    public void setPartes(Partes partes) {
        this.partes = partes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carrosPartesPK != null ? carrosPartesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarrosPartes)) {
            return false;
        }
        CarrosPartes other = (CarrosPartes) object;
        if ((this.carrosPartesPK == null && other.carrosPartesPK != null) || (this.carrosPartesPK != null && !this.carrosPartesPK.equals(other.carrosPartesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carrospartesejb.entity.CarrosPartes[ carrosPartesPK=" + carrosPartesPK + " ]";
    }
    
}
