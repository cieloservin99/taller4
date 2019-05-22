package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	//responde a la raiz del proyecto
	@RequestMapping("/")
	public String home(){
		System.out.println("Cargando pagina de inicio");
		//Crear el archivo dentro del webapp
		//Carpeta o nombre de archivo
		return"view/templates/index";
	}

}
