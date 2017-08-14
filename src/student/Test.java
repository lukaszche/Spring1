package student;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Test {
	public static void main(String[] args){
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student student=(Student)factory.getBean("studentbean");
		Student student2=(Student)factory.getBean("studentbean2");
		student.displayInfo();
		student2.displayInfo();
		
	}
}
