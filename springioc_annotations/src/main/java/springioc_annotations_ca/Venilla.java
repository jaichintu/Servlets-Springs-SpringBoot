package springioc_annotations_ca;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Venilla implements Icecream{

	@Override
	public void open() {
		System.out.println("venilla icecream opened");
		
	}
	
	
	
	

}
