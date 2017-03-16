/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrospartes.servicios;

//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.UriInfo;
import carrospartesejb.entity.Carros;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import carrospartesejb.session.CarrosFacadeLocal;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * REST Web Service
 *
 * @author flopez
 */

@Path("/serviciorest")
@Stateless
@LocalBean
public class ServicioRest {

//    @Context
//    private UriInfo context;

    @EJB
    private CarrosFacadeLocal gestionCarros;
    
    @GET
    @Path("/consultaCarros")
    @Produces(MediaType.APPLICATION_XML)
    public List<Carros> buscarCarros(){
        return gestionCarros.findAll();
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
     * Retrieves representation of an instance of carrospartes.servicios.ServicioRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
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
