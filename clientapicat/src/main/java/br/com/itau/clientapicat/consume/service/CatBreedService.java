package br.com.itau.clientapicat.consume.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.itau.clientapicat.consume.model.CatBreed;
import br.com.itau.clientapicat.consume.repository.CatBreedRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CatBreedService {

private final CatBreedRepository catBreedRepository;
    
    public List<CatBreed> findAllCatBreeds() {
        return catBreedRepository.findAll();
    }

    public CatBreed findDetailByCatBreed(String catBreedId) {
        return catBreedRepository.findByIdContaining(catBreedId);
    }
    
    public List<CatBreed> findCatBreedByTemperament(String temperament) {
        return catBreedRepository.findByTemperament(temperament);
    }

    
    public List<CatBreed> findCatBreedByOrigin(String origin) {
        return catBreedRepository.findByOrigin(origin);
    }
    

}
