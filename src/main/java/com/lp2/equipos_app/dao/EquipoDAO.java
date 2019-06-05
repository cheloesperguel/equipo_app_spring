/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2.equipos_app.dao;

import com.lp2.equipos_app.modelo.Equipo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcelo Esperguel
 */
public interface EquipoDAO extends CrudRepository<Equipo, Integer> {
    
}
