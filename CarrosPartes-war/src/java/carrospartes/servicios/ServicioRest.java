/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartes.servicios;

import carrospartesejb.entity.*;
import javax.ejb.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import carrospartesejb.session.*;
import java.util.List;

/**
 * REST Web Service
 *
 * @author flopez
 */

@Path("/serviciorest")
@Stateless
@LocalBean
public class ServicioRest {

    @EJB
    private CarrosFacadeLocal gestionCarros;
    
    @EJB
    private PropietarioFacadeLocal propCarros;
            
    
    /**
     * Retrieves representation of an instance of
     * carrospartes.servicios.ServicioRest
     * @return an instance of java.lang.String
     */

    @GET
    @Path("/consultaCarrosXML")
    @Produces(MediaType.APPLICATION_XML)
    public List<Carros> buscarCarrosXML(){
        return gestionCarros.findAll();
    }

    @GET
    @Path("/consultaCarrosJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Carros> buscarCarrosJSON(){
        return gestionCarros.findAll();
    }
    
    @GET
    @Path("/consultaPropietariosJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Propietario> buscarPropietariosJSON() {
        return propCarros.findAll();
    }
    
    
    @GET
    /*Tipo de llamada*/
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        /*Mostrará por pantalla el parámetro que le hemos pasado a la URL*/
        String output = "Test de parametros: " + msg;
        return Response.status(200).entity(output).build();
    }

    /**
     * PUT method for updating or creating an instance of ServicioRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
   
}
