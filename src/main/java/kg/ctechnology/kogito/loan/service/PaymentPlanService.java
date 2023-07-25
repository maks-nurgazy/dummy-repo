package kg.ctechnology.kogito.loan.service;

import javax.enterprise.context.ApplicationScoped;

import kg.ctechnology.kogito.loan.model.AppInfo;

@ApplicationScoped
public class PaymentPlanService {
    
    public AppInfo generatePaymentPlan(AppInfo appInfo){
        appInfo.setPaymentPlanData("Some payment plan data");
        return appInfo;
    }

}
