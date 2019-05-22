package py.edu.facitec.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controller.HomeController;
//Habilitar el modulo MVC de pring
@EnableWebMvc
//Sirve para cargar los paquetes del controller y dao (scaneo de componentes por paquetes)
@ComponentScan(basePackageClasses = { HomeController.class })
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	//Indicamos que es un objeto de configuracion 
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		//Prefijo de la pagina
		resolver.setPrefix("/static/");
		//Extension del archivo
		resolver.setSuffix(".html");
		return resolver;
	}
	//Habilitar las peticiones para recursos estáticos dentro de AppWebConfiguration.
		@Override
			public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
				configurer.enable();
			}}

	
	//Todo se resuelve con Ctrl+Espacio

