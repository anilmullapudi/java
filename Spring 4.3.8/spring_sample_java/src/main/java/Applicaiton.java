import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.learning.service.CustomerService;
import edu.learning.service.CustomerServiceImpl;

public class Applicaiton {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = context.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstname());

	}

}
