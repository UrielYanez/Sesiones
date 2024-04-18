package main.java.mx.utng.s34;

import java.util.Collection;

@Entity
public class Casa {
    @Id
    @GeneratedValue(strategy = GenerationTipe.IDENTITY)
    private Long id;

    private String jefeDeFamilia;

    @ElementCollection
    private Collection<String> otros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJefeDeFamilia() {
        return jefeDeFamilia;
    }

    public void setJefeDeFamilia(String jefeDeFamilia) {
        this.jefeDeFamilia = jefeDeFamilia;
    }

    public Collection<String> getOtros() {
        return otros;
    }

    public void setOtros(Collection<String> otros) {
        this.otros = otros;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((jefeDeFamilia == null) ? 0 : jefeDeFamilia.hashCode());
        result = prime * result + ((otros == null) ? 0 : otros.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Casa other = (Casa) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (jefeDeFamilia == null) {
            if (other.jefeDeFamilia != null)
                return false;
        } else if (!jefeDeFamilia.equals(other.jefeDeFamilia))
            return false;
        if (otros == null) {
            if (other.otros != null)
                return false;
        } else if (!otros.equals(other.otros))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Casa [id=" + id + ", jefeDeFamilia=" + jefeDeFamilia + ", otros=" + otros + "]";
    }

    
}
