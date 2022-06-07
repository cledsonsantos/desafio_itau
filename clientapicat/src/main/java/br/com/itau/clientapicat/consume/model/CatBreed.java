package br.com.itau.clientapicat.consume.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_cat_breed")
public class CatBreed implements Serializable {
	 /**
		 * 
		 */
		private static final long serialVersionUID = -242862613006271896L;

		@Id
	    private String id;
	    
	    @Column(length = 2000)
	    private String description;
	    
	    @Column(length = 100)
	    private String temperament;
	    
	    @Column(length = 100)
	    private String origin;

	}