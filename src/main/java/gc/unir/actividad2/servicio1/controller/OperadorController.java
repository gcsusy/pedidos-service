package gc.unir.actividad2.servicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class OperadorController {
	@GetMapping("/get")
    public String check() {
    return "Realizar los pedidos";
    }
}
