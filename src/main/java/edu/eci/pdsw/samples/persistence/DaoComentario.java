/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Comentario;
import java.util.List;
import java.util.Set;


/**
 *
 * @author hcadavid
 */
public interface DaoComentario {

    

     /**
     * Consultar todos los comentarios con un puntaje inferior o igual a N de acuerdo
     * con un rango de anos de nacimiento.
     * @param n puntaje N de referencia
     * @param a valor A del intervalo
     * @param b valor B del intervalo
     * @return el listado de todos los comentarios con un puntaje inferior a N de acuerdo
     * con un rango de edad dado [A..B], es decir, comentarios en donde
     * puntaje <= N    y   A < ano nacimiento <= B
     * @throws PersistenceException si hay un error en la persistencia
     */
    public List<Comentario> loadByScoreAndBirthYear(int n, int a, int b) throws PersistenceException;
    
    
    /**
     * Consultar todos los comentarios, ordenados por fecha
     * @return todos los comentarios, ordenados por fecha
     * @throws PersistenceException si hay un error de persistencia
     */
    public List<Comentario> loadAll() throws PersistenceException;
    
    
}
