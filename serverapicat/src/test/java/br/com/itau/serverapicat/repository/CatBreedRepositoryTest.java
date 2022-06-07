package br.com.itau.serverapicat.repository;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.itau.serverapicat.webservice.model.CatBreed;
import br.com.itau.serverapicat.webservice.repository.CatBreedRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CatBreedRepositoryTest {
	
	@Autowired
	private CatBreedRepository catBreedRepository;
	
	
	@Test
	@DisplayName("Save Persist  CatBreed whe Sucessful")
	void save_PersistCatBreed_WenSucessful() {
		CatBreed  catBreed = createCatBreed();
		
		CatBreed saveCatBreed = catBreedRepository.save(catBreed);
		
		Assertions.assertThat(saveCatBreed).isNotNull();
		
		Assertions.assertThat(saveCatBreed.getId()).isNotNull();
		
		Assertions.assertThat(saveCatBreed.getDescription()).isEqualTo(catBreed.getDescription());
		
	}
	
	@Test
	@DisplayName("Save Update CatBreed whe Sucessful")
	void save_UpdateCatBreed_WenSucessful() {
		CatBreed  catBreedSaved = createCatBreed();
		System.out.println("Descrição antes = " + catBreedSaved.getDescription());
		
		catBreedSaved.setDescription("Tese - descrição do gato");
		System.out.println("Descrição depois = " + catBreedSaved.getDescription());
		
		
		
		CatBreed saveCatBreedUpdate = this.catBreedRepository.save(catBreedSaved);
		System.out.println("Descrição depois do update= " + saveCatBreedUpdate.getDescription());
		
		Assertions.assertThat(saveCatBreedUpdate).isNotNull();
		
		Assertions.assertThat(saveCatBreedUpdate.getId()).isNotNull();
		
		Assertions.assertThat(saveCatBreedUpdate.getDescription()).isEqualTo(catBreedSaved.getDescription());
		
		
	}
	
	@Test
	@DisplayName("Delte Update CatBreed whe Sucessful")
	void delet_RemovesCatBreed_WenSucessful() {
		CatBreed  catBreedSaved = createCatBreed();
		
		CatBreed saveCatBreedUpdate = this.catBreedRepository.save(catBreedSaved);
		
		this.catBreedRepository.delete(saveCatBreedUpdate);
		
		Optional<CatBreed> catBreedOptional =  this.catBreedRepository.findById(saveCatBreedUpdate.getId());
		
		Assertions.assertThat(catBreedOptional).isEmpty();
		
	}
	
	
	private CatBreed createCatBreed() {
		return new CatBreed("braz", "American Bobtails are loving -  teste", "Comportado", "Brazil");
	}

}
