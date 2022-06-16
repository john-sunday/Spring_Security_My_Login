package es.johnsunday.springsecurity.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Indicamos el servlet que proporciona el recurso -> la página .jsp (home.jsp).
public class MyServletSpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Indicamos clase de configuración.
		return new Class[] {App.class};
	}

	@Override
	protected String[] getServletMappings() {
		// Indicamos el mapeo del servlet -> raiz.
		return new String[] {"/"};
	}

}
