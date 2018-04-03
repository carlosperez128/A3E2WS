/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeRest;

import java.util.Calendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author entrar
 */
@Path("hora")
public class GenericResource {

    int hora, minutos, segundos;
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource_1
     */
    public GenericResource() {
        Calendar calendario = Calendar.getInstance();                
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
    }

    /**
     * Retrieves representation of an instance of TimeRest.GenericResource_1
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        return ("{\"Hora\" : \"" +hora + "-" + minutos + "-" + segundos + "\"}");
    }

    /**
     * PUT method for updating or creating an instance of GenericResource_1
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
       String json = ("{\"Hora\" : \"" +hora + "-" + minutos + "-" + segundos + "\"}");
    }
}
