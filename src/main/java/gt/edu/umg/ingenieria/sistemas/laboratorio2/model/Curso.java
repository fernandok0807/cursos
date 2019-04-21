package gt.edu.umg.ingenieria.sistemas.laboratorio2.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@Entity
public class Curso implements Serializable {

    @Id
    private Long id;
    private String nombre;
    private String descripcion;
    private int creditos;
    private int semestre;


    public Curso() {
    }

    public Curso(Long id, String nombre, String descripcion, int creditos, int semestre) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.semestre = semestre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
        
}
