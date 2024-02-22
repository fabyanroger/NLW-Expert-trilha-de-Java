package com.fabyanroger.estudo_java;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/retornarPrimeira")
    public Usuario retornoPrimeiraController() {
        var usuario = new Usuario("Fabyan", 20);
        return usuario;
    }

    @PostMapping("/meuPrimeiroPost")
    public String primeiroPost() {
        return "Meu primeiro post";
    }

    record Usuario(String nome, int idade) {

    }
}
