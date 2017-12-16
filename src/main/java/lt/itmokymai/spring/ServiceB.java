package lt.itmokymai.spring;

import org.springframework.beans.factory.annotation.Required;

public class ServiceB {
    private ServiceA serviceA;
    @Required
    public void setServiceA(ServiceA serviceA){
        this.serviceA = serviceA;
    }
    public String getResult(){
        return "ServiceB result:" + serviceA.getResult();
    }
}
