package com.github.Joaovitor8708.biblioteca.service;

import com.github.Joaovitor8708.biblioteca.model.Livro;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {
    private final List<Livro> livro;

    public LivroService(@Qualifier("repositorioOrdenado") List<Livro> livro) {
        this.livro = livro;
    }

    public List<Livro> listarTodos(){
        return livro;
    }

    public Livro buscarPorId(Long id){
        return livro.stream()
                .filter(livro -> livro.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Livro> buscarPorCategoria(String categoria){
        return livro.stream()
                .filter(livro -> livro.getCategoria().equals(categoria))
                .collect(Collectors.toList());
    }

    public Livro adicionarLivro(Livro novoLivro){
       livro.add(novoLivro);
       return novoLivro;
    }
}
