/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Comentario;
import edu.eci.pdsw.samples.persistence.DaoComentario;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.services.ExcepcionServiciosSuscripciones;
import edu.eci.pdsw.samples.services.ServiciosSuscripciones;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class ServiciosSuscripcionesImpl implements ServiciosSuscripciones {

    @Inject
    private DaoComentario daoc;
       
    
    @Override
    public List<Comentario> comenteriosRegistrados() throws ExcepcionServiciosSuscripciones {
        List<Comentario> sp = null;
        try {
             sp=daoc.loadAll();
        } catch (PersistenceException ex) {
            Logger.getLogger(ServiciosSuscripcionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }

    @Override
    public List<Comentario> comenteriosMasBajosPorRangoNacimiento(int a, int b) throws ExcepcionServiciosSuscripciones {  
        List<Comentario> lower = null;
        try {
             lower=daoc.loadByScoreAndBirthYear(3, a, b);
        } catch (PersistenceException ex) {
            Logger.getLogger(ServiciosSuscripcionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lower;
    }  
}
