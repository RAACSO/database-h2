package basedatos.database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import basedatos.database.models.services.IclienteService;
@Controller
@SessionAttributes("cliente")
public class ClienteController {
    @Autowired
    private IclienteService clienteService;

    @RequestMapping(value = "/listar",method = RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo", "listado de clientes");
        model.addAttribute("clientes",clienteService.findAll());
        return "listar";
    }
}
