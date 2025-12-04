package com.edu.quote.controller.exemple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController /* Controler junto com response (nao necessariamente vai retornar uma resposta) */
@RequestMapping("/hello") /* mapeamento do endpoint */
public class helloworld {
    
    @GetMapping
    public String hello(){
        return "Hello World Spring Boot!";
    }

}

/*NOTAS**
STATELESS, STATEFULL */
