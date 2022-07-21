package br.com.alura.linguagensapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repositorio;


    @GetMapping("/linguagens")
    public List<Linguagem> getLinguagens() {
        return repositorio.findAll();
    }

    @PostMapping("/linguagens")
    public Linguagem cadastraLinguagem(@RequestBody Linguagem linguagem) {

        Linguagem linguagemSalva = repositorio.save(linguagem);

        return linguagemSalva;
    }
}
