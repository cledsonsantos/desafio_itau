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
@Table(name = "tb_imagem")
public class Imagem implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8672187130564377762L;

	@Id
    private String id;
    
    @Column(length = 150)
    private String url;
    
}
