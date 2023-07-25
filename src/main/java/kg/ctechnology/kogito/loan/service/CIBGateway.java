package kg.ctechnology.kogito.loan.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface CIBGateway {

    @POST
    @Path("/cibhistoryapi/history/test")
    String getCIBData();

}
