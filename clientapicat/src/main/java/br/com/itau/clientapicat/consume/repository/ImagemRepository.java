package br.com.itau.clientapicat.consume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.clientapicat.consume.model.Imagem;



@Repository
public interface ImagemRepository extends JpaRepository<Imagem, String> {

}

