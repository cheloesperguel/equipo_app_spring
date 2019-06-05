/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2.equipos_app.controlador;

import com.lp2.equipos_app.dao.EquipoDAO;
import com.lp2.equipos_app.modelo.Equipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Marcelo Esperguel
 */
@Controller
public class EquipoController {
    
    @Autowired
    private EquipoDAO eDAO;
    
    @GetMapping("/inscripcion")
    public String inscripcion(Model model) {
        model.addAttribute("equipo", new Equipo());
        return "inscripcion";
    }
    
    @PostMapping("/inscribeEquipo")
    public String inscribirForm(@ModelAttribute Equipo equipo){
        
        System.out.println(equipo.getNombre());
        
        eDAO.save(equipo);
        return "index";
    }
    
}
