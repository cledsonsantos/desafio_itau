package br.com.itau.clientapicat.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.itau.clientapicat.consume.model.CatBreed;
import br.com.itau.clientapicat.consume.repository.CatBreedRepository;
import br.com.itau.clientapicat.consume.service.CatBreedService;
import lombok.extern.log4j.Log4j2;



/*
 * Usando a versão jUnit 4
 */

@Log4j2
@RunWith(SpringRunner.class) 
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CatBreedServiceTest {
	
	@Autowired
	private CatBreedRepository catBreedRepository;
	
	
	@Autowired
	private CatBreedService catBreedService;
	

	@Test
	  public void gravar_devolverSucessoTest() {
		log.info("Inciando o teste: adcionar_devolverSucessoTest" );
		CatBreed catBreedNovo = criarNovoCatBreed();
		  catBreedRepository.save(catBreedNovo);
		  CatBreed catBreedPesquisado = catBreedService.findDetailByCatBreed("braz");
		  
		  assertEquals("braz", catBreedPesquisado.getId());
		  assertEquals("Descrição Teste", catBreedPesquisado.getDescription());
		  assertEquals("Comportado", catBreedPesquisado.getTemperament());
		  assertEquals("Brazil", catBreedPesquisado.getOrigin());
		 
	    }
	
	@Test
	  public void pesquisar_devolverSucessoTest() {
		  log.info("Inciando o teste: pesquisar_devolverSucessoTest" );
		  CatBreed catBreedGravado = catBreedService.findDetailByCatBreed("braz");
	     
		  assertEquals("braz", catBreedGravado.getId());
		  assertEquals("Descrição Teste", catBreedGravado.getDescription());
		  assertEquals("Comportado", catBreedGravado.getTemperament());
	    }
	  
	@Test
	  public void modificar_devolverSucessoTest () {
		  log.info("Inciando o teste: modificar_devolverSucessoTest" );
		  CatBreed catBreedGravado = catBreedService.findDetailByCatBreed("braz");
		  catBreedGravado.setDescription("Descrição alterada no teste");
		  catBreedRepository.save(catBreedGravado);
		  
		  assertNotEquals("Descrição Teste", catBreedGravado.getDescription());
	   }
	  
	@Test
	  public void excluir_devolverSucessoTest() {
		  log.info("Inciando o teste: excluir_devolverSucessoTest" );
		  catBreedRepository.deleteById("braz");
		  CatBreed catBreedGravado = catBreedService.findDetailByCatBreed("braz");
		  
		  assertFalse(catBreedGravado != null);
	    }
	  
	  public CatBreed criarNovoCatBreed() {
		  CatBreed catBreed = new CatBreed("braz", "Descrição Teste","Comportado", "Brazil" );
		  
		  return catBreed;
	  }

}
