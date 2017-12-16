package lt.itmokymai.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ServiceA serviceA = (ServiceA) context.getBean("serviceABean");
        ServiceB serviceB = (ServiceB) context.getBean("serviceBBean");
        serviceA.setMessage("Labytis");
        System.out.println(serviceA.getResult());
        System.out.println(serviceB.getResult());
        ((ConfigurableApplicationContext) context).close();




    }
}