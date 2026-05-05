package com.github.Joaovitor8708.biblioteca.config;

import com.github.Joaovitor8708.biblioteca.model.Livro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Livro> repositorioSimples() {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1L, "O Hobbit", "Tolkien", "Fantasia"));
        livros.add(new Livro(2L, "Clean Code", "Robert Martin", "Tecnologia"));
        livros.add(new Livro(3L, "Dom Casmurro", "Machado de Assis", "Literatura"));
        return livros;
    }

    @Bean
    public List<Livro> repositorioOrdenado() {
        List<Livro> livros = repositorioSimples();
        livros.sort(Comparator.comparing(Livro::getTitulo));
        return livros;
    }
}
