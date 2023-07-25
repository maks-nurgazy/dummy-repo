package kg.ctechnology.kogito.loan.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanCampaignInput {

    private Integer maturity;
    private Integer amount;
    private String campaignCode;
    private String channel;
    private String branch;
    private Integer customerNumber;
        
}
