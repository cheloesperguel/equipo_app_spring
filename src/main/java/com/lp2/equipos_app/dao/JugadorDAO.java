/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2.equipos_app.dao;

import com.lp2.equipos_app.modelo.Jugador;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcelo Esperguel
 */
public interface JugadorDAO extends CrudRepository<Jugador, Integer> {
    
}
