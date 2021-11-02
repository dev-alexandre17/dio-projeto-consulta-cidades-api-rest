package com.github.alexandregoncalo.citiesapi.countries.repository;

import com.github.alexandregoncalo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

// Informando o tipo da entidade e do identificador desta entidade.
// Representa o repositório do meu país (Country)

public interface CountryRepository extends JpaRepository<Country, Long> {
}
