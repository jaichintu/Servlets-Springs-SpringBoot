package springioc_annotations_ca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BabyDriver {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Baby baby=context.getBean(Baby.class);
		baby.eat();
	}

}
