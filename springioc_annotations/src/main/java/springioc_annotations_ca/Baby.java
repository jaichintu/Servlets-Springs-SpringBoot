package springioc_annotations_ca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	
	@Autowired
	Icecream icecream;
	
	
	void eat() {
		icecream.open();
		System.out.println("starts eating");
	}
}
