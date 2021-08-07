/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.ejemplo.ciudades.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jaguilar
 */
@Entity
@Table(name = "countrylanguage")
public class Countrylanguage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isofficial")
    private boolean isofficial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "percentage")
    private float percentage;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JsonIgnore
    @JoinColumn(name = "countrycode", referencedColumnName = "code")
    @ManyToOne(optional = false)
    private Country country;

    public Countrylanguage() {
    }

    public Countrylanguage(Integer id) {
        this.id = id;
    }

    public Countrylanguage(Integer id, String language, boolean isofficial, float percentage) {
        this.id = id;
        this.language = language;
        this.isofficial = isofficial;
        this.percentage = percentage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean getIsofficial() {
        return isofficial;
    }

    public void setIsofficial(boolean isofficial) {
        this.isofficial = isofficial;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Countrylanguage)) {
            return false;
        }
        Countrylanguage other = (Countrylanguage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.ejemplo.ciudades.entidades.Countrylanguage[ id=" + id + " ]";
    }
    
}
