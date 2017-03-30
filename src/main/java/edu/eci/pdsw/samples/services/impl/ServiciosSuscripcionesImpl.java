/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.samples.entities.Comentario;
import edu.eci.pdsw.samples.persistence.DaoComentario;
import edu.eci.pdsw.samples.services.ExcepcionServiciosSuscripciones;
import edu.eci.pdsw.samples.services.ServiciosSuscripciones;
import java.util.List;

/**
 *
 * @author hcadavid
 */
public class ServiciosSuscripcionesImpl implements ServiciosSuscripciones {

    @Inject
    private DaoComentario daoc;
       
    
    @Override
    public List<Comentario> comenteriosRegistrados() throws ExcepcionServiciosSuscripciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Comentario> comenteriosMasBajosPorRangoNacimiento(int a, int b) throws ExcepcionServiciosSuscripciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
