package com.github.Joaovitor8708.biblioteca.controller;

import com.github.Joaovitor8708.biblioteca.model.Livro;
import com.github.Joaovitor8708.biblioteca.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping("/livros")
    public List<Livro> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/livros/{id}")
    public Livro listarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @GetMapping("/livros/categoria/{categoria}")
    public List<Livro> listarPorCategoria(@PathVariable String categoria){
        return service.buscarPorCategoria(categoria);
    }

    @PostMapping("/livros")
    public Livro adicionarLivro(@RequestBody Livro livro){
        return service.adicionarLivro(livro);
    }
}
