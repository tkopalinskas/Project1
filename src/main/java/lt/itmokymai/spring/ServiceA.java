package lt.itmokymai.spring;

import org.springframework.beans.factory.annotation.Required;

public class ServiceA {
    private String message;
    public String getResult(){
        return getMessage();
    }


    public String getMessage() {
        return message;
    }
    @Required
    public void setMessage(String message){
        this.message = message;
    }
}
