package br.com.itau.serverapicat.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.serverapicat.webservice.model.Imagem;



@Repository
public interface ImagemRepository extends JpaRepository<Imagem, String> {

}

