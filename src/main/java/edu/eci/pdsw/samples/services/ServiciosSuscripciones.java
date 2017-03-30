package edu.eci.pdsw.samples.services;


import java.sql.Date;
import java.util.List;
import java.util.Set;
import edu.eci.pdsw.samples.entities.Comentario;

/**
 *
 * @author 2106913
 */
public interface ServiciosSuscripciones {

    
    /**
     * Consultar los comentarios con puntaje menor o igual a 3 en el rango de 
     * anos de nacimiento (A..B], es decir, donde A < ano_nacimiento <= B
     * @param a limite inferior del ano de nacimiento
     * @param b limite superior del ano de nacimiento
     * @return el listado de comentarios cuyo puntaje es mejor o igual a 3 de los
     * suscriptores que han nacido entre los anos A y B
     * @throws ServiceFacadeException si los parametros son inconsistentes: B<=A   
     *  o si se presenta un error a nivel de persistencia
     */
    public List<Comentario> comenteriosMasBajosPorRangoNacimiento(int a,int b) throws ExcepcionServiciosSuscripciones;
    

    /**
     * Consultar todos los comentarios registrados en el sistema, ordenados
     * desde el mas reciente hasta el mas antiguo
     * @return el listado de comentarios, con sus respectivos suscriptores
     */
    public List<Comentario> comenteriosRegistrados() throws ExcepcionServiciosSuscripciones;

    

}
