import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"edu.learning"})
public class AppConfig {
	
	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new  CustomerServiceImpl();
		customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		HibernateCustomerRepositoryImpl customerRepositoryImpl = new HibernateCustomerRepositoryImpl();
		return customerRepositoryImpl;
	}*/
}
