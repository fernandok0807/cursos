/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.dao.CursoRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.model.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author enmanuel
 */


@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;   
    
     public List<Curso> buscarTodos() {
        return (List<Curso>) this.cursoRepository.findAll();
    }
    
    public Curso nuevo(Curso nuevo) {               
        return this.cursoRepository.save(nuevo);
    }
}