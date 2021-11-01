package com.github.alexandregoncalo.citiesapi;

import com.github.alexandregoncalo.citiesapi.countries.Country;
import com.github.alexandregoncalo.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Para a API, projeto java, o banco de dados é o repositório de dados.
// Classe para retornar a lista de paises do banco de dados.

@RestController

// Requisição de mapeamento.

@RequestMapping("/countries")
public class CountryResource {

    // Injetar o repositório para funcionar.

    @Autowired
    private CountryRepository repository;

    public CountryResource (CountryRepository repository) {
        this.repository = repository;
    }

    // Receber uma página para o findAll do Spring.

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

}
