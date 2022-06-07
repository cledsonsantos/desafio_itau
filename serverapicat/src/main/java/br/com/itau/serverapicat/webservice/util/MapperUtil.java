package br.com.itau.serverapicat.webservice.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.itau.serverapicat.webservice.dto.CatBreedDTO;
import br.com.itau.serverapicat.webservice.dto.ImagemDTO;
import br.com.itau.serverapicat.webservice.model.CatBreed;
import br.com.itau.serverapicat.webservice.model.Imagem;


@Component
public class MapperUtil {
	
	// Conversão de DTO para Entity
    public CatBreedDTO converterParaDTO(CatBreed catBreed) {
    	ModelMapper modelMapper = new ModelMapper();
    	return modelMapper.map(catBreed, CatBreedDTO.class);
    }
    public List<CatBreedDTO> converterListaParaDTO(List<CatBreed> catBreeds) {
        return catBreeds.stream().map(breed -> converterParaDTO(breed))
                .collect(Collectors.toList());
    }
    
    
    // Conversão de Entity para DTO
    public CatBreed converterDTOParaCatBreed(CatBreedDTO catBreedDTO) {
    	ModelMapper modelMapper = new ModelMapper();
    	return modelMapper.map(catBreedDTO, CatBreed.class);
    }  
    public List<CatBreed> converterListaDTOParaListaCatBreed(List<CatBreedDTO> catBreedsDTO) {
        return catBreedsDTO.stream().map(breed -> converterDTOParaCatBreed(breed))
                .collect(Collectors.toList());
    }
    public Imagem converterDTOParaImage(ImagemDTO imagemDTO) {
    	ModelMapper modelMapper = new ModelMapper();
    	return modelMapper.map(imagemDTO, Imagem.class);
    }
    public List<Imagem> converterListaDTOParaListaImage(List<ImagemDTO> imagensDTO) {
        return imagensDTO.stream().map(imagem -> converterDTOParaImage(imagem))
                .collect(Collectors.toList());
    }
        

    
    
        
    
    
}
