package mx.utng.s26.model.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (length = 40, nullable = false)
    @NotEmpty
    private String name;

    @Column (length = 100, nullable = false)
    @NotEmpty
    @Email
    private String author;

    @Column (length = 40, nullable = false)
    @NotEmpty
    private String editorial;

    @Temporal(TemporalType.DATE)
    private Date recordAt;

    @PrePersist
    public void PrePersist(){
        recordAt = new Date();
    }


    //GETTERS Y SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public Date getRecordAt() {
        return recordAt;
    }
    public void setRecordAt(Date recordAt) {
        this.recordAt = recordAt;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getEditorial() {
        return editorial;
    }
    
}
