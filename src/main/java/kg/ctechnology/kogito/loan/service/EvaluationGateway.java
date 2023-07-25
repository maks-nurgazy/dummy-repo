package kg.ctechnology.kogito.loan.service;

import kg.ctechnology.kogito.loan.model.LoanCampaignRequest;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import kg.ctechnology.kogito.loan.model.LoanCampaignResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface EvaluationGateway {

    @POST
    @Path("/LoanCampaign")
    @Consumes(MediaType.APPLICATION_JSON)
    LoanCampaignResponse evaluate(LoanCampaignRequest request);
    
}
