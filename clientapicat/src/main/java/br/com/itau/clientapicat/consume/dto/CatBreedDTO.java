package br.com.itau.clientapicat.consume.dto;

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
