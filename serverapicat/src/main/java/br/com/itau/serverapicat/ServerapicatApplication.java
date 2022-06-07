package br.com.itau.serverapicat;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import br.com.itau.serverapicat.webservice.service.CatBreedService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@EnableFeignClients
@SpringBootApplication
public class ServerapicatApplication {

	@Autowired
	private CatBreedService catBreedService;
	
	public static void main(String[] args) {
		SpringApplication.run(ServerapicatApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner() {
      return args -> {
    	  log.info("Iniciando a carregamento da lista de gatos Case The Cat API");
    	  catBreedService.findAllCatBreeds();

    	  log.info("Iniciando a carregamento da lista de gatos com chapéu !");
    	  catBreedService.findImagensByCategory(1l);

    	  log.info("Iniciando a carregamento da lista de gatos com óculos !");
    	  catBreedService.findImagensByCategory(4l);
       
      };
    }

}
