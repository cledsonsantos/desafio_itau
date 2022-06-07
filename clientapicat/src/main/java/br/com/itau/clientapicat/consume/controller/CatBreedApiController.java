package br.com.itau.clientapicat.consume.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.clientapicat.consume.model.CatBreed;
import br.com.itau.clientapicat.consume.service.CatBreedService;
import br.com.itau.clientapicat.consume.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RequiredArgsConstructor
@Log4j2
@RestController
@RequestMapping("breeds")
public class CatBreedApiController {

    private final CatBreedService catBreedService;
    private final DateUtil dateUtil;
    
    @GetMapping
    public ResponseEntity<List<CatBreed>> findAllCatBreeds() {
    	log.info("Chamou o findAllBreeds - Listar todo os gatos de todas as racas" + " - " + 
    			dateUtil.formatLocalDateTime(LocalDateTime.now()));
    	
        return ResponseEntity.ok(catBreedService.findAllCatBreeds());
        
    }

    @GetMapping(path =  "/id/{id}")
    public ResponseEntity<CatBreed> findBreedsByBreed(@PathVariable String id){
    	log.info("Chamou o findBreedsByBreed - Listar os detalhes de uma Raça" + " - " + 
    				dateUtil.formatLocalDateTime(LocalDateTime.now()));
    	
     	  return ResponseEntity.ok(catBreedService.findDetailByCatBreed(id));
    }
    
    @GetMapping(path = "/temp/{temperament}")
    public ResponseEntity<List<CatBreed>> findCatBreedByTemperament(@PathVariable String temperament){
    	log.info("Chamou o findCatBreedByTemperament - Listar as raças por temperamento" + " - " + 
				dateUtil.formatLocalDateTime(LocalDateTime.now()));
    	
        return ResponseEntity.ok(catBreedService.findCatBreedByTemperament(temperament));
    }

    @GetMapping(path = "/ori/{origin}")
    public ResponseEntity<List<CatBreed>> findBreedByOrigin(@PathVariable String origin) {
    	log.info("Chamou o findBreedByOrigin - Listar as raças pela origem" + " - " + 
				dateUtil.formatLocalDateTime(LocalDateTime.now()));
    	
    	return ResponseEntity.ok(catBreedService.findCatBreedByOrigin(origin));
    }

}

