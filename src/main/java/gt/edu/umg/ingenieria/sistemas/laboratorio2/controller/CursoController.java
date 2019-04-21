/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.model.Catedratico;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.model.Curso;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author enmanuel
 */
@RestController
@RequestMapping("/cursos")
public class CursoController {
    
    @Autowired
    private CursoService cursoService;
    
    @GetMapping("/buscarTodos")
    public List<Curso> Todos() {
            return this.cursoService.buscarTodos();
    }
    
    @PostMapping("/crear")
    public Curso Nuevo(@RequestBody(required = true) Curso nuevo){
        return this.cursoService.nuevo(nuevo);
    }
    
}
