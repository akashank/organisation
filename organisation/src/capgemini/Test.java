package capgemini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DemoTest.xml");
		organisation orgs =(organisation) context.getBean("org");
		System.out.println(orgs);

	}

}
