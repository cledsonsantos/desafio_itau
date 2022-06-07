//package br.com.itau.serverapicat.webservice.util;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@EnableWebMvc 
//@Configuration
//public class SwaggerConfig implements WebMvcConfigurer {
//
//	@Bean
//	public Docket docket(){
//			
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("br.com.itau.serverapi"))
//				.paths(PathSelectors.ant("/**"))
//				.paths(PathSelectors.any())
//				.build()
//				.apiInfo(apiInfo());
//		}
//	private ApiInfo apiInfo(){
//		return new ApiInfoBuilder()
//				.title("Desafio itau - The Cat Api")
//				.description("Consumo da The Cat Api")
//				.version("1.0")
//				.build();    
//		}    
//	}
//	
//	 
//	