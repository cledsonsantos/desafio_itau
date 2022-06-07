package br.com.itau.serverapicat.webservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CatBreedDTO {

    private String id;
    private String description;
    private String temperament;
    private String origin;

}
