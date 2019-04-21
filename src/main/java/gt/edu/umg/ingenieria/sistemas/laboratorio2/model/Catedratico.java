    package gt.edu.umg.ingenieria.sistemas.laboratorio2.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@Entity
public class Catedratico implements Serializable {

    @Id
    private Long id;
    private String nombres;
    private String apellidos;
    private String codigo_catedratico;


    public Catedratico() {
    }

    public Catedratico(Long id, String nombres, String apellidos, String codigo_catedratico) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo_catedratico = codigo_catedratico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo_catedratico() {
        return codigo_catedratico;
    }

    public void setCodigo_catedratico(String codigo_catedratico) {
        this.codigo_catedratico = codigo_catedratico;
    }


    
}
