/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.dao.CatedraticoRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.model.Catedratico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author enmanuel
 */
@Service
public class CatedraticoService {
    @Autowired
    private CatedraticoRepository catedraticoRepository;   
    
     public List<Catedratico> buscarTodos() {
        return (List<Catedratico>) this.catedraticoRepository.findAll();
    }
    
    public Catedratico nuevo(Catedratico nuevo) {               
        return this.catedraticoRepository.save(nuevo);
    }
}
