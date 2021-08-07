package mx.lania.ejemplo.ciudades.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jaguilar
 */
@Entity
@Table(name = "country")
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "continent")
    private String continent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "region")
    private String region;
    @Basic(optional = false)
    @NotNull
    @Column(name = "surfacearea")
    private float surfacearea;
    @Column(name = "indepyear")
    private Short indepyear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "population")
    private int population;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lifeexpectancy")
    private Float lifeexpectancy;
    @Column(name = "gnp")
    private BigDecimal gnp;
    @Column(name = "gnpold")
    private BigDecimal gnpold;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "localname")
    private String localname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "governmentform")
    private String governmentform;
    @Size(max = 2147483647)
    @Column(name = "headofstate")
    private String headofstate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "code2")
    private String code2;
    @Basic(optional = true)
    @Column(name = "capital")
    private Integer idCapital;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
    private Collection<Countrylanguage> countrylanguageCollection;

    public Country() {
    }

    public Country(String code) {
        this.code = code;
    }

    public Country(String code, String name, String continent, String region, float surfacearea, int population, String localname, String governmentform, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfacearea = surfacearea;
        this.population = population;
        this.localname = localname;
        this.governmentform = governmentform;
        this.code2 = code2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getSurfacearea() {
        return surfacearea;
    }

    public void setSurfacearea(float surfacearea) {
        this.surfacearea = surfacearea;
    }

    public Short getIndepyear() {
        return indepyear;
    }

    public void setIndepyear(Short indepyear) {
        this.indepyear = indepyear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Float getLifeexpectancy() {
        return lifeexpectancy;
    }

    public void setLifeexpectancy(Float lifeexpectancy) {
        this.lifeexpectancy = lifeexpectancy;
    }

    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    public BigDecimal getGnpold() {
        return gnpold;
    }

    public void setGnpold(BigDecimal gnpold) {
        this.gnpold = gnpold;
    }

    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }

    public String getGovernmentform() {
        return governmentform;
    }

    public void setGovernmentform(String governmentform) {
        this.governmentform = governmentform;
    }

    public String getHeadofstate() {
        return headofstate;
    }

    public void setHeadofstate(String headofstate) {
        this.headofstate = headofstate;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public Collection<Countrylanguage> getCountrylanguageCollection() {
        return countrylanguageCollection;
    }

    public void setCountrylanguageCollection(Collection<Countrylanguage> countrylanguageCollection) {
        this.countrylanguageCollection = countrylanguageCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Country)) {
            return false;
        }
        Country other = (Country) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.ejemplo.ciudades.entidades.Country[ code=" + code + " ]";
    }
    
}
