package springioc_annotations_ca;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

@Primary

public class ButterScotch implements Icecream {

	@Override
	public void open() {
		
		System.out.println("butterscotch icecream is opened");
		
	}
	

}
