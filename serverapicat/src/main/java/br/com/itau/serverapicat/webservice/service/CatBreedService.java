package br.com.itau.serverapicat.webservice.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.itau.serverapicat.webservice.apirest.ServerApiCat;
import br.com.itau.serverapicat.webservice.dto.CatBreedDTO;
import br.com.itau.serverapicat.webservice.dto.ImagemDTO;
import br.com.itau.serverapicat.webservice.model.CatBreed;
import br.com.itau.serverapicat.webservice.model.Imagem;
import br.com.itau.serverapicat.webservice.repository.CatBreedRepository;
import br.com.itau.serverapicat.webservice.repository.ImagemRepository;
import br.com.itau.serverapicat.webservice.util.DateUtil;
import br.com.itau.serverapicat.webservice.util.MapperUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class CatBreedService {

    private final ServerApiCat serverApiCat;
    private final CatBreedRepository catBreedRepository;
    private final ImagemRepository imagemRepository;
	private final DateUtil dateUtil;
	private final MapperUtil mapperUtil;
    
    
	public List<CatBreedDTO> findAllCatBreeds() {
      	log.info("Chamou o findAllCatBreeds !");
  		log.info(dateUtil.formatLocalDateTime(LocalDateTime.now()));
  	
  		List<CatBreedDTO> listCatBreedsDTO = serverApiCat.findAllCatBreeds();
  		List<CatBreed> listCatBreeds = mapperUtil.converterListaDTOParaListaCatBreed(listCatBreedsDTO);
  		
  	 	log.info("Gravando Lista de gatos geral .....");
  		catBreedRepository.saveAll(listCatBreeds);
  		log.info("Fim da gravação. Lista gravada com sucesso !");
  		
  		
        return listCatBreedsDTO;
	}
	
	public List<ImagemDTO> findImagensByCategory(Long categoryId) {
		log.info("Chamou o método findImagensByCategory. Catergiar = " + categoryId);
  		log.info(dateUtil.formatLocalDateTime(LocalDateTime.now()));
  		
  		List<ImagemDTO> listImagensDTO = serverApiCat.findImagensByCategory(categoryId);
  		List<Imagem> listImagens = mapperUtil.converterListaDTOParaListaImage(listImagensDTO);
  		
  		log.info("Gravando Lista de gatos da categoria:  " + categoryId);
  		imagemRepository.saveAll(listImagens);
  		log.info("Fim da gravação. Lista gravada com sucesso !");
  		
		return listImagensDTO;
	}


}
