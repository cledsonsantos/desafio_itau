package br.com.itau.clientapicat.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.itau.clientapicat.consume.model.CatBreed;
import br.com.itau.clientapicat.consume.repository.CatBreedRepository;

@RunWith(SpringRunner.class) 
@SpringBootTest
public class CatBreedRepositoryTest {

	@Autowired
    private CatBreedRepository catBreedRepository;
	
		 
	 @Test
	  void verificaRepositorioParaPersistenciaDoCatBreed_deveDevolverSucesso() {
	    CatBreed cat = new CatBreed();
	    cat.setId("juni");
	    cat.setDescription("Testydo repositório");
	    cat.setOrigin("Junit 4");
	    cat.setTemperament("Normal");

	    catBreedRepository.save(cat);
	    assertNotNull(cat.getId());
	  }
	 
	 
	
	 
}
