package kg.ctechnology.kogito.loan.service;

import kg.ctechnology.kogito.loan.model.AppInfo;
import kg.ctechnology.kogito.loan.model.LoanCampaignRequest;
import kg.ctechnology.kogito.loan.model.LoanCampaignResponse;
import kg.ctechnology.kogito.loan.model.LoanCampaignInput;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class EvaluationService {

    @Inject
    @RestClient
    EvaluationGateway evaluationGateway;

    public AppInfo evaluate(AppInfo appInfo) {

        LoanCampaignInput input = new LoanCampaignInput();
        input.setMaturity(appInfo.getMaturity());
        input.setAmount(appInfo.getAmount());
        input.setCampaignCode("DIGITAL_KREDI");
        input.setChannel("MOBILE");
        input.setBranch(appInfo.getBranch());

        if(appInfo.getCustomer().getCustomerNumber() != null)
            input.setCustomerNumber(appInfo.getCustomer().getCustomerNumber());

        LoanCampaignRequest request = new LoanCampaignRequest();
        request.setApplication(input);

        LoanCampaignResponse response = evaluationGateway.evaluate(request);

        appInfo.setInterestRate(response.getInterest());

        return appInfo;
    }

}
