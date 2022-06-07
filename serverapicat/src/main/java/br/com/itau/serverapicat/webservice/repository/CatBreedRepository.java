package br.com.itau.serverapicat.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.serverapicat.webservice.model.CatBreed;


@Repository
public interface CatBreedRepository extends JpaRepository<CatBreed, String> {
    
}
