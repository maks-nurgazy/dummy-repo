package kg.ctechnology.kogito.loan.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AppInfo implements Serializable {

    private static final long serialVersionUID = 0L;

    private Customer customer;
    private String submitterChannel;
    private String ownerChannel;
    private String workType;
    private Integer salary;
    private String decision;
    private String cibData;
    private Integer maturity;
    private Integer amount;
    private String branch;
    private Double interestRate;

    private String paymentPlanData;

    private SignDocument signedDocuments;
}
