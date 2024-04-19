package mx.utng.session29.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Partido {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //el generated value es para que se autoincremente por si solo, y el GenerationType es para que este incremento suceda en el apartado de entidad
    private Long id;

    @ManyToOne
    @JoinColumn(name = "equipo_local", referencedColumnName = "id")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visitante", referencedColumnName = "id")
    private Equipo equipoVisitante;

    private Integer marcador_Local;
    
    private Integer marcador_Visitante;


    //Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Integer getMarcador_Local() {
        return marcador_Local;
    }

    public void setMarcador_Local(Integer marcador_Local) {
        this.marcador_Local = marcador_Local;
    }

    public Integer getMarcador_Visitante() {
        return marcador_Visitante;
    }

    public void setMarcador_Visitante(Integer marcador_Visitante) {
        this.marcador_Visitante = marcador_Visitante;
    }

    //generacion de hash code and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((equipoLocal == null) ? 0 : equipoLocal.hashCode());
        result = prime * result + ((equipoVisitante == null) ? 0 : equipoVisitante.hashCode());
        result = prime * result + ((marcador_Local == null) ? 0 : marcador_Local.hashCode());
        result = prime * result + ((marcador_Visitante == null) ? 0 : marcador_Visitante.hashCode());
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
        Partido other = (Partido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (equipoLocal == null) {
            if (other.equipoLocal != null)
                return false;
        } else if (!equipoLocal.equals(other.equipoLocal))
            return false;
        if (equipoVisitante == null) {
            if (other.equipoVisitante != null)
                return false;
        } else if (!equipoVisitante.equals(other.equipoVisitante))
            return false;
        if (marcador_Local == null) {
            if (other.marcador_Local != null)
                return false;
        } else if (!marcador_Local.equals(other.marcador_Local))
            return false;
        if (marcador_Visitante == null) {
            if (other.marcador_Visitante != null)
                return false;
        } else if (!marcador_Visitante.equals(other.marcador_Visitante))
            return false;
        return true;
    }

    
    
}
