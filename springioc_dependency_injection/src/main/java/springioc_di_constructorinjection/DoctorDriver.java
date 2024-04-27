package springioc_di_constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DoctorDriver {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("iocconstructor.xml");
		
		Doctor doctor=(Doctor) context.getBean("doc");
		
		System.out.println(doctor);
		
        Doctor doctor1=(Doctor) context.getBean("doc1");
		
		System.out.println(doctor1);
		
		
		
		
		
	}

}
