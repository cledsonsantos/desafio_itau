package br.com.itau.clientapicat.consume.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.clientapicat.consume.model.CatBreed;


@Repository
public interface CatBreedRepository extends JpaRepository<CatBreed, String> {
	
	CatBreed findByIdContaining(String catBreedId);
	
	List<CatBreed> findByTemperament(String temperament);
	
    List<CatBreed> findByOrigin(String origin);
    
}
