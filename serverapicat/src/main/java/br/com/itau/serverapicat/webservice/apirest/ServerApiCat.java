package br.com.itau.serverapicat.webservice.apirest;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.itau.serverapicat.webservice.dto.CatBreedDTO;
import br.com.itau.serverapicat.webservice.dto.ImagemDTO;



@FeignClient(name = "cats", url = "https://api.thecatapi.com/v1")
public interface ServerApiCat {

	  @GetMapping(value = "/breeds", consumes = "application/json")
	  List<CatBreedDTO> findAllCatBreeds();

	  @GetMapping(value = "/images/search?limit=3&categoryId={categoryId}", consumes = "application/json")
	  List<ImagemDTO> findImagensByCategory(@PathVariable("categoryId") Long categoryId);

}



