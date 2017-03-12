/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartesejb.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author flopez
 */
@Entity
@Table(name = "CARROS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carros.findAll", query = "SELECT c FROM Carros c")
    , @NamedQuery(name = "Carros.findByPlaca", query = "SELECT c FROM Carros c WHERE c.placa = :placa")
    , @NamedQuery(name = "Carros.findByMarca", query = "SELECT c FROM Carros c WHERE c.marca = :marca")
    , @NamedQuery(name = "Carros.findByModelo", query = "SELECT c FROM Carros c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "Carros.findByColor", query = "SELECT c FROM Carros c WHERE c.color = :color")})
public class Carros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "PLACA")
    private String placa;
    @Size(max = 20)
    @Column(name = "MARCA")
    private String marca;
    @Size(max = 50)
    @Column(name = "MODELO")
    private String modelo;
    @Size(max = 50)
    @Column(name = "COLOR")
    private String color;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carros")
    private Collection<CarrosPartes> carrosPartesCollection;

    public Carros() {
    }

    public Carros(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @XmlTransient
    public Collection<CarrosPartes> getCarrosPartesCollection() {
        return carrosPartesCollection;
    }

    public void setCarrosPartesCollection(Collection<CarrosPartes> carrosPartesCollection) {
        this.carrosPartesCollection = carrosPartesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placa != null ? placa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carros)) {
            return false;
        }
        Carros other = (Carros) object;
        if ((this.placa == null && other.placa != null) || (this.placa != null && !this.placa.equals(other.placa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carrospartesejb.entity.Carros[ placa=" + placa + " ]";
    }
    
}
