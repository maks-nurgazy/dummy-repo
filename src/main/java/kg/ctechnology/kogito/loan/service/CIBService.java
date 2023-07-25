package kg.ctechnology.kogito.loan.service;

import kg.ctechnology.kogito.loan.model.AppInfo;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CIBService {

    @Inject
    @RestClient
    CIBGateway cibGateway;

    public AppInfo getCIBData(AppInfo appInfo) {
        String response = cibGateway.getCIBData();
        if(!response.isEmpty())
            appInfo.setCibData(response);
        return appInfo;
    }

}
