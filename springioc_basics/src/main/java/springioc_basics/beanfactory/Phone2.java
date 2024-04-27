package springioc_basics.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Phone2 {
	
	public static void main(String[] args) {
		ClassPathResource resource=new ClassPathResource("iocbeanfactory.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		MusicPlayer musicPlayer=(MusicPlayer) beanFactory.getBean("mp");
		musicPlayer.play();
	}

}
