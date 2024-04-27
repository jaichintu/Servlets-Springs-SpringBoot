package ioccontainers.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		
		// finding xml file
//		ClassPathResource resource=new ClassPathResource("beanfactory.xml");
		
		
		// loading xml file to container
//		BeanFactory beanFactory=new XmlBeanFactory(resource);
//		
//		Employee e=(Employee) beanFactory.getBean("emp");
//		
//		Employee e1=(Employee) beanFactory.getBean("emp");
	
//		System.out.println(e==e1);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beanfactory.xml");
		
		context.getBean("emp");
		
		
		
		
		
		
	}

}
