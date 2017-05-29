import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.learning.service.CustomerService;

public class Applicaiton {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = context.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstname());


	}

}
