package my.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SimpleSpringMainApp {
	
//		   public static void main(String[] args) {
//		      ApplicationContext ctx = 
//		         new AnnotationConfigApplicationContext(TextEditorConfig.class);
//
//		      TextEditor te = ctx.getBean(TextEditor.class);
//		      te.spellCheck();
//		      te.printAProperty();
//		      
//
//		   }
		   
		   public static void main(String[] args) {
			      SpringApplication.run(SimpleSpringMainApp.class, args);
			      
			      ApplicationContext ctx = 
					         new AnnotationConfigApplicationContext(TextEditorConfig.class, AnnotationConfigApplicationContext.class);

					      TextEditor te = ctx.getBean(TextEditor.class);
					      te.spellCheck();
					      te.printAProperty();
			   }
	

}
