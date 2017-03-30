/*
 * Copyright (C) 2016 hcadavid
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
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Comentario;
import edu.eci.pdsw.samples.services.ExcepcionServiciosSuscripciones;
import edu.eci.pdsw.samples.services.ServiciosSuscripciones;
import edu.eci.pdsw.samples.services.ServiciosSuscripcionesFactory;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 2106991
 */

@ManagedBean(name = "ReporteComentarios")
@SessionScoped

public class ReportesComentariosBean implements Serializable{
    
    ServiciosSuscripciones ss = ServiciosSuscripcionesFactory.getInstance().getSuscriptionServices();
    int a;
    int b;
    
    public ReportesComentariosBean(){
      a=0;
      b=0;
    }
    public List<Comentario> getComentarios() throws ExcepcionServiciosSuscripciones{
        return ss.comenteriosRegistrados();
    }
    
    public List<Comentario> getComentariosXanio() throws ExcepcionServiciosSuscripciones{
        return ss.comenteriosMasBajosPorRangoNacimiento(a, b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
   
}
