package mcvdemo.config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
@Configuration
public class Web  implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// Create the dispatcher servlet's Spring application context
			      AnnotationConfigWebApplicationContext dispatcherContext =
			        new AnnotationConfigWebApplicationContext();
			      dispatcherContext.register(AppConfig.class);
			      servletContext.addListener(new ContextLoaderListener(dispatcherContext));	
			      // Register and map the dispatcher servlet
			      ServletRegistration.Dynamic dispatcher =
			       servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
			      dispatcher.setLoadOnStartup(1);
			      dispatcher.addMapping("/");
			    }
		
	}


