package kg.ctechnology.kogito.loan.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanCampaignResponse {
    
    private LoanCampaignInput application;
    private Double interest;

}
