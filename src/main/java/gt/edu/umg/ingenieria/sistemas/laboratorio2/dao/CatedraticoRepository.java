/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.dao;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.model.Catedratico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author enmanuel
 */

@Repository
public interface CatedraticoRepository extends CrudRepository<Catedratico, Integer> {
    
}
