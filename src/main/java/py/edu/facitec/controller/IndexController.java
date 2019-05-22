package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	//No se puede repetir la url
	@RequestMapping("/algo")
	public String nombreMetodo() {
		System.out.println("Cargando desde el otro controlador");
		//Carpeta de archivo
		return"view/templates/index";
		}

	
}
